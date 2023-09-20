
public class Oops1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("green");
        System.out.println(p1.color);
    }
}
class Pen {
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void tip(int setTip){
        tip = setTip;
    }
}

