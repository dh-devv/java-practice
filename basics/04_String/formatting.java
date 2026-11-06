public class formatting {
    public static void main(String[] args) {

        // 문자열 포매팅이란? --> 문자열 안에 어떤 값을 삽입하는 방법이다.

        /*
        %d : 정수형
        %f : 실수형
        %s : 문자열
        %c : 문자
        %b : 불리언
        */


        // 숫자 대입하기
        int month = 11;
        int day = 4;

        System.out.println(String.format("오늘은 %d월 %d일 입니다.", month, day)); // 오늘은 11월 4일 입니다.

        // 문자열 대입하기
        String date = "11월 4일";
        
        System.out.println(String.format("오늘은 %s 입니다.", date)); // 오늘은 11월 4일 입니다.

        // 불리언 대입하기
        boolean isTrue = true;

        System.out.println(String.format("이 문장은 %b 입니다.", isTrue)); // 이 문장은 true 입니다.

        // 문자 대입하기
        char ch = 'A';

        System.out.println(String.format("이 문자는 %c 입니다.", ch)); // 이 문자는 A 입니다.
  
    }
}
