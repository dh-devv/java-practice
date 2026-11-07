import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListToStringExample {
    public static void main(String[] args) {

        String[] data = {"138", "140", "142"};
        ArrayList<String> data_list = new ArrayList<>(Arrays.asList(data));

        System.out.println("리스트의 요소 개수: " + data_list.size());
        System.out.println("리스트의 모든 요소: " + data_list);

        System.out.println("");

        ArrayList<String> new_data_list = new ArrayList<>(Arrays.asList("138", "140", "142"));
        System.out.println(new_data_list);

        String joined_data = String.join(", ", new_data_list);
        System.out.println("리스트를 문자열로 변환: " + joined_data);

        // join을 사용하지 않은 로직
        String result = "";
        for (int i = 0; i < new_data_list.size(); i++) {
            result += new_data_list.get(i);
            result += ", ";
        }
        // 마지막 ", " 제거
        if (result.length() > 0) {
            result = result.substring(0, result.length() - 2);
        }
        System.out.println("리스트를 문자열로 변환 (join 미사용): " + result);
        
    }
}
