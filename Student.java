public class Student extends Person {

    private String id;
    private float score;

    public Student(String name, String cardid, int power, String id, float score) {
        super(name, cardid, power);
        this.id = id;
        this.setScore(score);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public void learning() {
        this.score += 10;
        int temp = super.getPower();
        super.setPower(temp - 1);
    }

    public int x_id(int x, int y) {
        String xxx = this.getId();
        int temp = Integer.parseInt(xxx.substring(x, y));
        return temp;
    }

    public String college() {
        String xueyuan[] = { "0", "计算机学院", "自动化学院", "物电学院", "化工学院", "生工学院", "管理学院", "人文学院", "外语学院" };
        return xueyuan[x_id(4, 5)];
    }

    public String major() {
        String xueyuan[] = { "0", "计算机科学与技术", "软件工程", "电子商务", "网络工程" };
        return xueyuan[x_id(5, 6)];
    }

    public void showinfo() {
        super.output();
        System.out.println("学号: "+this.id);
        System.out.println("学院: " + this.college());
        System.out.println("专业: " + this.major());
        System.out.println("成绩: " + this.score);
    }

}
