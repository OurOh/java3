package lang.wrapper5;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newIntger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println();
        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longObj = " + longValue);

        System.out.println();
        System.out.println("비교");
        System.out.println("== " + (newInteger == integerObj));
        System.out.println("equlas: " + newInteger.equals(integerObj));

    }
}
