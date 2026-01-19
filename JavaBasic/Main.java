import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main ps = new Main();
        ps.num4();

    }

    public void num1(){
        Student student = new Student("Daniel", 24, 95);
        System.out.println(student.name + ": " + student.age + " years old & point:" + student.score);
    }

    public void num2(){
        Student student = new Student("Daniel", 24, 95);
        System.out.println(student.name + ": " + student.age + " years old & point:" + student.score);
        print(student);
        System.out.println(student.name + ": " + student.age + " years old & point:" + student.score);

    }

    public void print(Student student){
        student.score++;
        student.age++;
        System.out.println(student.name + ": " + student.age + " years old & point:" + student.score);
    }

    public void num3(){
        Student student1 = new Student("Daniel", 24, 95);
        System.out.println(student1.name + " / " + student1.age + " / " + student1.score + " / count:" + Student.count);

        Student student2 = new Student("John", 20, 75);
        System.out.println(student2.name + " / " + student2.age + " / " + student2.score + " / count:" + student2.count);

        Student student3 = new Student("Chris", 14, 25);
        System.out.println(student3.name + " / " + student3.age + " / " + student3.score + " / count:" + Student.count);
    }

    public void num4(){
        Person person = new Person("John", 15);
        person.introduction();

        Student student = new Student("Daniel", 24, 95);
        student.introduction();
    }

    public static class Person{
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void introduction(){
            System.out.println(name + " is a Person");
        }
    }

    public static class Student extends Person{
        public static int count;
        private String name;
        private int age;
        private int score;

        public Student(String name, int age, int score){
            super(name, age);
            this.score = score;
            count++;
        }

        @Override
        public void introduction(){
            System.out.println(super.name + " is a Student");
        }
    }


}

