public class practice2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "iron";
        System.out.println(s1.name);
    }
    
}
class Person {
    String name;
    int weight;
}
class Student extends Person{
    int rollNum ;
    String schoolName;
}
