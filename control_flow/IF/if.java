public class if {

    public static void main(String[] args) {

        int x = 3;
        int y = 2;

        Systme.out.pritnln(x > y);
        System.out.println(x < y);
        System.out.println(x == y);
        System.out.println(x != y);

        System.out.println("");

        int money = 3000;
        boolean hasCard = true;

        if (money >= 3000 || hasCard ) {
            Systme.out.println("택시를 타고 가라.");
        }
        else {
            System.out.pritnln("걸어가라.");
        }
        
        /*
        if (money >= 3000) {
            System.out.println("택시를 타고 가라.");
        }
        else {
            System.out.println("걸어가라");
        }
        */
        
    }
}