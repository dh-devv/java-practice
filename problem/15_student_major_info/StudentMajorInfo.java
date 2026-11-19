import java.util.HashMap;

public class StudentMajorInfo {
    public static void main(String[] args) {
        HashMap<String, String> data = new HashMap<>();  // 이름 : 전공  ( data = 학생들 정보 );

        boolean change = true;

        data.put("민수", "Java");
        data.put("현수", "Python");
        data.put("서연", "Web");
        data.put("수빈", "Cloud");

        System.out.println(data.keySet());

        System.out.println("==== 학생 정보 조회 ====\n");
        System.out.println("학생 이름: 민수");
        System.out.println("전공: " + data.get("민수"));

        if (change) {
            System.out.println("변경 사항\n");
            System.out.print("민수의 전공이 " + data.get("민수") + "---> ");
            data.put("민수", "Spring");

            System.out.println(data.get("민수") + "로 변경됨");
        }
    }
}
