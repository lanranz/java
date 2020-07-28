package club.banyuan.student;

public class Main {
    public static void main(String[] args) {
        HigherSchoolStudent hss = new HigherSchoolStudent("高中生");
        PrimarySchoolStudent pss = new PrimarySchoolStudent("小学生");
        MiddleSchoolStudent mss = new MiddleSchoolStudent("中学生");
        hss.study();
        pss.study();
        mss.study();
    }
}
