class Person {
    private String name;
    private String cardid;
    private int power;

    public Person() {
    }

    public Person(String name, String cardid) {
        this.name = name;
        this.cardid = cardid;
    }

    public Person(String name, String cardid, int power) {
        this.name = name;
        this.cardid = cardid;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void output() {
        System.out.println("姓名： " + name);
        System.out.println("身份证： " + shen(cardid));

        if (lengtVerify(cardid)) {
            System.out.println("出生日期： " + chu(cardid));
            System.out.println("性别： " + checksex(cardid));
        }
        System.out.println("体力 " + power);
    }

    public static String chu(String s) {
        String x = s.substring(6, 10) + "年" + s.substring(10, 12) + "月" + s.substring(12, 14) + "日";
        return x;
    }

    public static boolean lengtVerify(String s) {
        if (s.length() == 18)
            return true;
        return false;
    }

    public static String shen(String s) {
        if (lengtVerify(s))
            return s;
        return "false-->xxx";
    }

    public static String checksex(String s) {
        if ((int) s.charAt(16) % 2 == 1)
            return "boy";
        return "girl";
    }

    public void sleep() {
        this.power += 1;
    }

    public void run() {
        this.power -= 1;
    }

}

public class Temp {

    public static void main(String[] args) {

        Person xiao = new Person("xiaoxiaoran", "412825200002242113");
        xiao.output();
        System.out.println();
        Person xiao1 = new Person("肖萧然", "1234554545454546789", 10);
        xiao1.output();
        xiao1.run();
        System.out.println(xiao1.getPower());
        xiao1.sleep();
        System.out.println(xiao1.getPower());

    }

}
