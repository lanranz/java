import java.util.*;

public class Class {
   private Set<Student> students = new HashSet<>();

   public Set<Student> getStudents() {
      return students;
   }

   public void setStudents(Set<Student> students) {
      this.students = students;
   }

   public void addStudent(Student student){
      students.add(student);
   }

   public void print(){
      for (Student student : students) {
         System.out.println(student);
      }
   }

   public List<Student> sortById() {
      List<Student> list = new LinkedList<>();
      list.addAll(students);
      list.sort((o1, o2) -> o1.getId()-o2.getId());
      return list;
   }

   public List<Student> sortByAge(){
      List<Student> list = new LinkedList<>();
      list.addAll(students);
      list.sort((o1, o2) -> o2.getAge()-o1.getAge());
      return list;
   }
}
