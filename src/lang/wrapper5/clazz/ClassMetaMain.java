package lang.wrapper5.clazz;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) {

        Class clazz = String.class; //1.클래스에서 조회

        Field[] fields = clazz.getDeclaredFields();
        for (Field filed : fields) {
            System.out.println("Field:" + filed.getType() + " " + filed.getName());
        }

        //모든 메서드 출력
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method);
        }

        System.out.println("Superclass: " + clazz.getSuperclass().getName());

        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface:" + i.getName());
        }

    }
}
