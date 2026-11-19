import java.util.HashSet;
import java.util.Arrays;

public class SetMethodsExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();


        // add : 집합 자료형에 값을 추가할 때 사용한다.
        set.add("Jump");
        set.add("To");
        set.add("Java");

        System.out.println(set);

        // addAll : 값을 한 번에 여러 개를 추가할 때 사용한다.
        set.addAll(Arrays.asList("study", "student"));

        System.out.println(set);
        

        // remove : 특정 값을 제거할 때 사용한다.
        set.remove("To");
        System.out.println(set);
    }
}
