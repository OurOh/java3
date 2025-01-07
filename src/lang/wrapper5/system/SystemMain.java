package lang.wrapper5.system;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis: " + currentTimeMillis);

        //현재 시간(나노초)를 가져온다.
        Long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano: " + currentTimeNano);

        //환경변수를 읽는다.
        System.out.println("getenv = " + System.getenv());

        //시스템 속성을 읽는다.
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));
    }
}
