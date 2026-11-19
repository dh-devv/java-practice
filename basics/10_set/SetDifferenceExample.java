import java.util.Arrays;
import java.util.HashSet;

public class SetDifferenceExample {

    public static void main(String[] args) {

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> difference = new HashSet<>(s1); // s1으로 차집합 결과 생성
        difference.removeAll(s2); // 차집합 수행

        System.out.println(difference); // [1, 2, 3]
    }
} 