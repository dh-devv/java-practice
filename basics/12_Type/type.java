public class type {
    
    public static void main(String[] args) {
        String num = "123";
        int n = Integer.parseInt(num); // String인 num을 Integer로 만든 후 n에 저장
        
        System.out.println(n);
    
        String new_n = "" + n;  // int인 n을 String으로 바꾼 후 new_n에 저장
        System.out.println(new_n); 

        // 정수를 문자열로 바꾸는 방법들
        String num1 = String.valueOf(n);
        String num2 = Integer.toString(n);

        System.out.println(num1);
        System.out.println(num2);
    
    
        num = "123.456";
        double d = Double.parseDouble(num); // 문자열을 실수로 바꾸기

        System.out.println(d);

        
    }
}
