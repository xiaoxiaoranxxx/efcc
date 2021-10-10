import java.util.HashSet;
import java.util.Set;

/**
 * 某班级投票竞选班干部，班级学生人数为100人，每个学生只能投一票。
 * 本任务要求，编程实现一个投票程序，每个学生只能投一次票，投票成功提示“感谢你的投票”，若重复投票，提示“请勿重复投票”。
 * 当投票总数达到100时或者主观结束投票时，同时统计投票学生人数和投票结果。
 */

public class Voter {
    // 属性的定义
    private static final int MAX_COUNT = 100; // 最大投票数
    private static int count; // 投票数
    // 静态变量，存放已经投票的学生
    private static Set<Voter> voters = new HashSet<Voter>();
    private String name;
    private String answer;

    // 构造方法
    public Voter(String name) {
        this.name = name;
    }

    // 投票
    public void voterFor(String answer) {
        if (count == MAX_COUNT) {
            System.out.println("投票结束。");
            return;
        }
        if (voters.contains(this)) {
            System.out.println(name + "，请勿重复投票。");
        } else {
            this.answer = answer;
            count++;
            voters.add(this);
            System.out.println(name + " 感谢你的投票。");
        }
    }

    // 打印投票结果
    public static void printVoterResult() {
        System.out.println("当前投票数为：" + count);
        System.out.println("参与投票的学生和结果如下：");

        for (Voter voter : voters) {
            System.out.println(voter.name + " 意见 " + voter.answer);
        }
    }

    public static void main(String[] args) {
        // 创建参与投票的学生对象
        Voter tom = new Voter("Tom");
        Voter jack = new Voter("Jack");
        Voter mike = new Voter("Mike");
        // 学生开始投票
        tom.voterFor("是");
        tom.voterFor("否");
        jack.voterFor("是");
        mike.voterFor("66");
        // 打印投票结果
        Voter.printVoterResult();
    }
}