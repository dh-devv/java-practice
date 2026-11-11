public class whileLoop {
    public static void main(String[] args) {
        int i = 0;

        while (i<10) {
            i++;
            if ( i == 5 ) continue; // 5번 째는 건너뛰기

            System.out.println( i + "번 반복했습니다.\n");

            if (i == 10) {
                System.out.println("반복이 종료됩니다.");
            }
        }
    }
}