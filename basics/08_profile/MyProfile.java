/*
사용자의 기본 정보를 변수에 저장하고 콘솔에 출력하는 프로그램을 작성하기

요구사항
1. 이름, 나이, 학교, 전공을 변수로 선언한다.
2. 각 변수에 값을 저장한다.
3. 저장한 정보를 콘솔에 출력한다.
4. 출력 결과를 보기 좋게 구성한다.
*/

public class MyProfile { 
    
    public static void main(String[] args) {
        String name = "변동헌";
        int age = 17;
        String school = "부산 컴퓨터과학고등학교";
        String study = "IT";

        System.out.println("==========================");
        System.out.println("이름 : " +name);
        System.out.println("나이 : " +age);
        System.out.println("학교 : " +school);
        System.out.println("전공 : " +study);
        System.out.println("==========================");
    }
}
