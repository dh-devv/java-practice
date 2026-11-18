import java.util.ArrayList;
import java.util.Arrays;

public class average2 {

    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>(
            Arrays.asList(70, 60, 55, 75, 95, 90, 80, 80, 85, 100));
        
        int total = 0;
        for ( int score: scores ) {
            total += score;
        }
        
        float average = (float) total / scores.size();
        System.out.println(average);
    }
}