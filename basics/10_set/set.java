import java.util.Arrays;
import java.util.HashSet;

public class set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l" ,"o"));
        System.out.println(set); // [e,h,l,o]


        HashSet<Integer> num1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        HashSet<Integer> num2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9, 10));


        // 교집합 구하기
        HashSet<Integer> intersection = new HashSet<>(num1); // num1 값을 유지하기

        intersection.retainAll(num2); // 교집합 수행
        System.out.println(intersection); // [4,5,6,7]

        // 합집합 구하기
        HashSet<Integer> union = new HashSet<>(num1); // num1 값을 유자히고 새 변수에 저장

        union.addAll(num2); // 합칩합 수행
        System.out.println(union); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }
}
