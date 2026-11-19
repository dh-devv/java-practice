public class RegistrationNumberParts {
    
    public static void main(String[] args) {
        String pin = "123456-7891011";

        String s1 = pin.substring(0, 6);
        String s2 = pin.substring(7, 14);

        System.out.println(s1);
        System.out.println(s2);
    }
}
