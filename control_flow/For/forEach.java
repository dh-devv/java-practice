import java.util.Arrays;
import java.util.ArrayList;

public class forEach {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        /*
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
            */

        for (int number: numbers) {
            System.out.println(number);
        }

        System.out.println("");
        
        ArrayList<String> StringNumbers = new ArrayList<>(Arrays.asList("1", "2", "3"));
        for (String Number: StringNumbers) {
            System.out.println(Number);
        }

    }
}