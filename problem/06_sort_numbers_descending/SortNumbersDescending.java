import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class SortNumbersDescending {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        numbers.sort(Comparator.reverseOrder());

        System.out.println(numbers);
    }    
}
