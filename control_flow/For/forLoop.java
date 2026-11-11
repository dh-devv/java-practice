public class forLoop {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};
        int[] marks = {90, 25, 67, 45, 80};

        for (int i=0; i<marks.length; i++) {
            if (i==3) continue;
            if (marks[i] > 60) {
                System.out.println(i+1 + "번 합격");
            }
            else System.out.println(i+1 + "번 불합격");
        }
    }
}