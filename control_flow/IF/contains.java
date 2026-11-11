import java.util.ArrayList;

public class contains {

    public static void main(String[] args) {
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("cellphone");
        pocket.add("money");

        if (pocket.contains("money")) System.out.println("택시를 타고 걸어가라");
        else System.out.println("걸어가라.");
    }
}