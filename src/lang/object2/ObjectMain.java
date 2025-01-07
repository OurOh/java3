package lang.object2;

public class ObjectMain {

    public static void main(String[] args) {

        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        String string = child.toString();
        System.out.println(string);
        System.out.println(string);
    }
}
