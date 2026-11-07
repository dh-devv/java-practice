import java.util.HashMap;
import java.util.ArrayList;

public class mapFunction {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // put : key와 value를 추가할 수 있다. 
        map.put("people", "사람");
        map.put("baseball", "야구");

        // get : key에 해당하는 value를 가져온다.
        System.out.println(map.get("people")); // 사람 출력
    
        /*
        key에 해당하는 value가 없다면 null이 리턴된다.
        getOrDefault를 사용하면 기본값을 얻을 수 있다.
         */
        

        // containsKey : 맵에 해당 key가 있는 지 불리안으로 반환
        System.out.println(map.containsKey("people"));
        System.out.println(map.containsKey("scholl"));


        // remove : key의 항목을 삭제한 후 value 값을 리턴한다.
        System.out.println(map.remove("baseball"));


        // size : 맵 요소의 개수를 리턴한다.
        System.out.println(map.size());


        // keySet : 맵의 모든 key를 모아서 리턴한다.

        map.put("name", "동헌");
        map.put("age", "17");

        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        System.out.println(map.keySet()); // 집합 자료형으로 리턴한다.
        System.out.println(keyList);

    }
}
