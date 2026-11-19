// import java.util.ArrayList;

public class StarPyramid {

    public static void main(String[] args) {

        for ( int i = 1; i<6; i++) {
            // ArrayList<String> star = new ArrayList<>();
            
            for (int j = 0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
            /*
            for (int j=i; j<6; j++) {
                star.add("*");

                if ( star.size() == j ) {
                    System.out.println(star);
                    break;
                }
 
            }
            */
        }
    }
}