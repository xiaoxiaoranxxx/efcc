package xiaoxiaoran1.薪资管理;

class Graduate implements StudentManagerInterface {
    private String name, sex;
    private int age;
    private double fee, pay;

    Graduate(String name, String sex, int age, double fee, double pay) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.fee = fee;
        this.setPay(pay);
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public void setFree(double fee) {
        this.fee = fee;
    }

    @Override
    public double getFree() {
        return fee;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
