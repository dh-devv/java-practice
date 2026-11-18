public class three {
    public static void main(String[] args) {

        int result = 0;
        int i = 1;

        while (i <= 1000) {
            if ( i % 3 == 0 ) result += i;
            i++;
        }

        System.out.println(result);
    }
}