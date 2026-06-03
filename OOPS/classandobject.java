package OOPS;

class student{
    public String name;
    public int age;
    public String email;
    public int rollNo;

    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
        System.out.println(rollNo);
    }
}
public class classandobject {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Abuthahir;";
        s1.age = 20;
        s1.email = "abuthahirmohammed6@gmail.com;" ;
        s1.rollNo = 224026;

        s1.display();

        student s2 = new student();
        s2.name = "Manikkam";
        s2.age = 30;
        s2.email = "manikkamiphone@gmail.com";
        s2.rollNo = 224314;

        s2.display();

        student s3 = new student();
        s3.name = "Madesh";
        s3.age = 31;
        s3.email = "madesh123@gmail.com";
        s3.rollNo = 224010;

        s3.display();


    }
}
