package com.zz.dao;

import com.zz.pojo.Department;
import com.zz.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    //模拟数据库中的数据
    private static Map<Integer, Employee> employees = null;
    //员工有所属部门
    @Autowired
    private DepartmentDao departmentDao;
    static{
        employees = new HashMap<Integer,Employee>();
        employees.put(1001,new Employee(1001,"aa","741852963@qq.com",1,new Department(101,"前端")));
        employees.put(1002,new Employee(1002,"bb","963852741@qq.com",0,new Department(102,"后台")));
        employees.put(1003,new Employee(1003,"cc","123685748@qq.com",1,new Department(103,"测试")));
        employees.put(1004,new Employee(1004,"dd","987321654@qq.com",0,new Department(104,"运维")));
        employees.put(1005,new Employee(1005,"ee","951753852@qq.com",1,new Department(105,"项目经理")));
    }
    //主键自增
    private static Integer initId = 1006;
    //增加一个员工
    public void save(Employee employee){
        if (employee.getId() == null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));

        employees.put(employee.getId(),employee);
    }

    //查询全部员工信息
    public Collection<Employee> getAll(){
        return employees.values();
    }

    //通过id查询员工
    public Employee getEmployeeById(Integer id){
        return employees.get(id);
    }

    //删除员工
    public void delete(Integer id){
        employees.remove(id);
    }
}
