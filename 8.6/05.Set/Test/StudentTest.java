import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StudentTest {

    @Test

    public void test() {
        Class aClass = new Class();
        Student a = new Student(1, "李四", 18);
        Student b = new Student(7,"张三",25);
        aClass.addStudent(a);
        aClass.addStudent(b);
        aClass.addStudent(new Student(2, "王五", 20));
        aClass.addStudent(new Student(3, "王五", 22));
        aClass.addStudent(new Student(4, "赵六", 17));
        aClass.addStudent(new Student(5, "刘八", 16));

        aClass.print();

        List<Student> list = aClass.sortById();
        Assert.assertEquals(a, list.get(0));
        Assert.assertEquals(b,aClass.sortByAge().get(0));

    }

}
