class base{
    public void firstmethod(){
        System.out.println("first");

    }
}
class sub extends base{
    public void secondmethod(){
        System.out.println("second");
    }
}
public class SingleInheritance{
    public static void main(String[] args) {
        sub s = new sub();
        s.firstmethod();
        s.secondmethod();
    }
}