package club.banyuan.student;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public void study() {
        System.out.println(name + "开始学习");
    }
}
