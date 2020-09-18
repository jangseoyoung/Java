public class HelloWorld {
    public static void main(String[] args){
        //자바 실행방법 : Control + Shift + R
        //Hello World 출력하기
        System.out.println("Hello World");

        //변수 선언 규칙
        //대소문자 구분, 특수문자 사용 불가능(단, _은 예외), 숫자로 시작하는 변수 불가능, 자바 예약어 불가능
        //카멜케이스로 쓰는 것이 좋음.(ex : myName)
        int age;
        age = 17;

        int num = 20;
        age = 21;
        age = num;
        age = age+1;

        //print : 줄바꿈 없이 출력
        //println : 줄바꿈하며 출
        System.out.print("Hello, I'm ");
        System.out.print(age);
        System.out.println(".");

        boolean myBoolean = true;
        System.out.println(myBoolean);

        //주황색 : 자바의 기본 자료형
        int myInt = 123;
        long myLong = 12345678910L;
        double myDouble = 12.3;

        //String 색만 다른 이유 : 자바의 기본 자료형이 아니기 때문. (객체 또는 클래스)
        String myString = "Seoyoung";
        System.out.print("Hello. I'm ");
        System.out.println(myString);
    }
}
