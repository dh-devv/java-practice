import java.util.Arrays;
import java.util.ArrayList;


public class Final { // 값을 단 한 번만 설정할 수 있게 강제하는 키워드이다.
    
    public static void main(String[] args) {
        final int n = 123;
        // n = 456; --> 오류가 난다.

        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        // a = new ArrayList<>(Arrays.asList("c", "d")); --> 오류가 난다.
    }
}
