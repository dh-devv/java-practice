import java.util.HashMap;

// grade Map 에서 B에 해당되는 값을 삭제해 보자.
public class RemoveMapEntry {
    public static void main(String[] args) {

        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        int result = grade.remove("B");

        System.out.println(result);
        System.out.println(grade);
    }
}