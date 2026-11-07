import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> example = new ArrayList<>(Arrays.asList(100, 99, 101));
        example.sort(Comparator.naturalOrder()); // 오름차순으로 정렬하기

        System.out.println(example);
        example.sort(Comparator.reverseOrder()); // 내림차순으로 정렬하기

        System.out.println(example);
    }
}
