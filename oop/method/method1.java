public class method1 {
    static int sum(int num1, int num2) { // 매개변수 2개를 받아 합을 반환하는 함수
        return num1+num2;
    }

    static String say() {  // 매개변수가 없는 함수
        return "Hi";
    }

    public static void main(String[] args) {
        int number = method1.sum(17, 18);  // 17과 18을 인수로 sum 함수 실행하기

        System.out.println(number);
        String hello = method1.say();

        System.out.println(hello);
    }
}