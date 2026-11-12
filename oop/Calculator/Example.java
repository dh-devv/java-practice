class Calculator {
    static int result = 0; // 전역 변수

    int add(int num) {
        result += num;

        return result;
    }

    int sub(int num) {
        result -= num;

        return result;
    }
}

public class Example {
    public static void main(String[] args) {

        // 새로운 객체를 생성한다.
        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        System.out.println(cal1.add(3));
        System.out.println(cal1.sub(4));

        System.out.println("");

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));

        

        /*
        // 하나의 객체라면 이렇게 해도 되지만 객체가 여러 개 필요하다면 다르다.
        System.out.println(Calculator.add(3));
        System.out.println(Calculator.add(4));
        */
    }
}