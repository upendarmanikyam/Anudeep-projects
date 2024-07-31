package javafullstack;
import java.util.ArrayList;
public class StudentList {
    
    public static class Student {
        private String name;
        private int age;
        private int id;
        
        public Student(String name, int age, int id) {
            this.name = name;
            this.age = age;
            this.id = id;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public int getAge() {
            return age;
        }
        
        public void setAge(int age) {
            this.age = age;
        }
        
        public String getId() {
            return id;
        }
        
        public void setId(int id) {
            this.id = id;
        }
        
        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", id='" + id + '\'' +
                    '}';
        }
    }
    
    public static void main(String[] args) {
        // Create an ArrayList to hold Student objects
        ArrayList<Student> studentList = new ArrayList<>();
        
        // Add 10 Student objects to the ArrayList
        studentList.add(new Student("upendar", 22, 01));
        studentList.add(new Student("sridevi", 22, 02));
        studentList.add(new Student("venkat", 22, 03));
        studentList.add(new Student("sai kumar", 22,04));
        
        // Print each student using foreach loop
        System.out.println("Printing Student List:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
