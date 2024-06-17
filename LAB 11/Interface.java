package javafullstack;

interface Person1 {
 void speak();
}

class Student1 implements Person1{
 
 public void speak() {
     System.out.println("Student says: Good morning, maam ");
 }
}


class Teacher implements Person1 {
 
 public void speak() {
     System.out.println("Teacher says: Good morning, students");
 }
}

public class Interface {
 public static void main(String[] args) {
	// TODO Auto-generated method stub
     
     Person1 student = new Student1();
     Person1 teacher = new Teacher();

    
     student.speak();
     teacher.speak();
 }
}
