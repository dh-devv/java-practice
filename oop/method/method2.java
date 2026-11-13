public class method2 {

    static void sayNickname(String nick) {   // 리턴 값이 없는 함수
        if ("바보".equals(nick)) return;   // 리턴은 반환이 아니라 종료로도 쓸 수 있다.

        System.out.println("나의 별명은 " +nick+ "입니다.");
    }

    static int varTest(int i) {  // 입력받은 매개변수를 1 증가시키는 함수
        i++;
        return i;
    }

    public static void main(String[] args) {
        method2 MH = new method2();

        MH.sayNickname("야호");
        MH.sayNickname("바보");

        method2 Num = new method2();
        
        int number = 17;
        number = method2.varTest(number);  // number를 인자로 호출

        System.out.println(number);

    }
}