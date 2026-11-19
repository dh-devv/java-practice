
/*
국어, 영어, 수학 점수의 평균을 구하는 프로그램
 */

public class SubjectScoreAverage {
    public static void main(String[] args) {
        int math = 55;
        int korean = 80;
        int english = 75;

        int average = (math + korean + english ) / 3;
        System.out.println(average);
    }
}
