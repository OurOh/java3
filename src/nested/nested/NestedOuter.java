package nested.nested;

public class NestedOuter {

    private int outInstanceValue = 2;
    private static int outClassValue = 3;


    static class Nested{
        private int nestedInstancValue = 1;

        public void print(){
            // 자신의 멤버에 접근
            System.out.println(nestedInstancValue); //1

            // 바깥 클래스의 인스턴스 멤버에 접근에는 접근이 불가하다.
            //System.out.println(outInstanceValue);

            // 대신, 바깥 클래스의 객체가 생성되어야 접근 가능.
            NestedOuter outer = new NestedOuter();
            System.out.println(outer.outInstanceValue); //2


            //바깥 클래스의 클래스 멤버에는 접근할 수 있다. priavte도 가능
            System.out.println(NestedOuter.outClassValue);  //3
        }





    }
}
