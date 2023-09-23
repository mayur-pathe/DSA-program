public class practice1 {
    public static void main(String[] args) {
        student s = new student();
        s.name = "Pooma";
        System.out.println(s.name);
    }
}

class student {
    String name;
    int marks;
}
