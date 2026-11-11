import java.util.ArrayList;
import java.util.Arrays;

public class changeString {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>(Arrays.asList("Life", "is", "to", "short"));

        String result = String.join(" ", List);
        System.out.println(result);
    }
}