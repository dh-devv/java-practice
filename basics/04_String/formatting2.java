public class formatting2 {
    public static void main(String[] args) {
        
        int integer = 17;
        float floating = 3.14f; // java에서 소수를 선언할 때는 f를 붙여야 한다.

        System.out.printf("정수: %d, 실수: %.2f\n", integer, floating);
        
        /*이런 식으로 자료형에 따라 다른 포맷 코드를 써야 하지만 
        %s 를 통해 모든 자료형을 문자열로 출력할 수 있다.
        */

        System.out.println(String.format("정수: %s, 실수: %s", integer, floating));

        // %s 를 사용하면 공백과 정렬을 할 수 있기도 하다.
        System.out.println(String.format("%10s", "hi")); // hi가 오른쪽 정렬되어 출력됨 ( 공백 포함 10칸이 출력 )

        System.out.println(String.format("%-10s ", "hi")); // hi가 왼쪽 정렬되어 출력됨 ( 공백 포함 10칸이 출력 )
        

        // 소수점 표현하기
        System.out.println(String.format("%.4f", 3.141592)); // 3.1415 가 출력됨

        // System.out.println(String.format()); --> Sysatem.out.printf(); 로 단축시켜서 사용할 수 있다.
        System.out.printf("정수: %s, 실수: %.2f\n", integer, floating);

    }
}
