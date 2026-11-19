import java.util.ArrayList;
import java.util.Arrays;

class Score {
    public int averageFunction(ArrayList<Integer> scores) {

        int total = 0;
        for(int i=0; i<scores.size(); i++) {
            total += scores.get(i);
        }
        return total/scores.size();
    }
}
public class StudentScoreReport {
    public static void main(String[] args) {
        String[] name_array = {"민수", "지훈", "서연", "수빈", "현우"};
        // int[] score_array = {85, 90, 95, 80, 75};
        ArrayList<Integer> score_list = new ArrayList<>(Arrays.asList(85, 90, 95, 80, 75));

        Score average = new Score();
        float result = (float)average.averageFunction(score_list);
        System.out.println("평균 점수: " + result);

        for (int i=0; i<score_list.size(); i++) {
            System.out.println(String.format("\n이름: %s", name_array[i]));
            System.out.println("점수: " + score_list.get(i));
        }
    }
}