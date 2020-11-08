public class Operator {
    public static void main(String[] args){
        System.out.println("숫자 연산자");
        int a = 10;
        double b = 4; //피연산자 중 하나라도 소수형이면 결과값도 소수가 됨. 소수형>정수

        System.out.println(a + "+" + b+ "=" + (a+b));
        System.out.println(a + "-" + b+ "=" + (a-b));
        System.out.println(a + "*" + b+ "=" + (a*b));
        System.out.println(a + "/" + b+ "=" + (a/b));
        System.out.println(a + "%" + b+ "=" + (a%b));

        System.out.println("\n");
        System.out.println("비교 연산자");

        System.out.println(3 + ">" + 2 + " : " + (3 > 2));
        System.out.println(3 + "<" + 2 + " : " + (3 < 2));
        System.out.println(3 + ">=" + 2 + " : " + (3 >= 2));
        System.out.println(3 + "<=" + 2 + " : " + (3 <= 2));
        System.out.println(3 + "==" + 2 + " : " + (3 == 2));
        System.out.println(3 + "!=" + 2 + " : " + (3 != 2));

        System.out.println("\n");
        System.out.println("불린 연산자 - and");

        System.out.println("true && true : " + (true && true));
        System.out.println("false && false : " + (false && false));
        System.out.println("true && false : " + (true && false));
        System.out.println("false && true : " + (false && true));

        System.out.println("\n");
        System.out.println("불린 연산자 - or");


        System.out.println("true || true : " + (true || true));
        System.out.println("false || false : " + (false || false));
        System.out.println("false || true : " + (false || true));
        System.out.println("true || false : " + (true || false));

        System.out.println("\n");
        System.out.println("불린 연산자 - not");

        System.out.println("!true : " + !true);
        System.out.println("!false : " + !false);




    }
}
