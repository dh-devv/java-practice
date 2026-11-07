public class ArrayExample {
    public static void main(String[] args) {
    
        int[] odds = {1, 3, 5, 7, 9};
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

        // 배열의 길이 설정하기
        String[] week_array = new String[7]; // 7과 같은 크기를 지정해야 오류가 안 생긴다.

        week_array[0] = "월";
        week_array[1] = "화";
        week_array[2] = "수";
        week_array[3] = "목";
        week_array[4] = "금";
        week_array[5] = "토";
        week_array[6] = "일";

        System.out.println(week_array[0]);

        // 배열의 길이 구하기
        System.out.println("배열의 길이: " + week_array.length);
        
        for (int i = 0; i < week_array.length; i++) {
            System.out.println(week_array[i]);
        }
    }
}