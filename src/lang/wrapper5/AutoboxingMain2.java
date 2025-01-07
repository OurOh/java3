package lang.wrapper5;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value  = 10;
        Integer boxedValue = value;

        // Wrapper -> Primitive
        int unboxedValue = boxedValue;

        System.out.println("boxedvalue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

    }
}
