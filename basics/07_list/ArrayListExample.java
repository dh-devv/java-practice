import java.util.ArrayList;  // ArrayList 클래스를 사용하기 위해 import

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(); // list 생성

        // add : 리스트에 요솟값을 추가하기

        pitches.add("138");
        pitches.add("140");
        pitches.add("142");

        System.out.println("리스트의 크기: " + pitches.size());
        System.out.println("첫 번째 요소: " + pitches.get(0));
        

        // 위치를 지정하여 추가히기
        pitches.add(0, "100");
        System.out.println("첫 번째 요소 추가 후: " + pitches.get(0));

        // get : 리스트에서 특정 인덱스 값을 출력
        System.out.println("두 번째 요소: " + pitches.get(1));
        System.out.println("리스트의 모든 요소: " + pitches);

        // size : ArrayList의 요소의 개수를 반환
        System.out.println("리스트의 크기: " + pitches.size());

        // contains : 리스트 안에 해당 항목이 있는 지 판별한다.
        System.out.println("리스트에 140이 있는가? " + pitches.contains("140"));
        System.out.println("리스트에 150이 있는가? " + pitches.contains("150"));

        /*
        remove : 객체 또는 인덱스에 해당하는 항목을 삭제하기.
        */

        pitches.remove("140"); // 객체를 삭제
        pitches.remove(0);   // 인덱스를 지정하여 삭제
    }
}
