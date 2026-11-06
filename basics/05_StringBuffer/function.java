public class function {
    
    public static void main(String[] args) {
    
        StringBuffer sb = new StringBuffer();
        
        // append : 문자열을 뒤에 추가
        sb.append("Hello");
        sb.append(" java");

        System.out.println(sb.toString());

        // toString() 을 사용하면 StringBuffer를 String 자료형으로 변경할 수 있다.

        String str = sb.toString();
        System.out.println(str);

        // insert : 특정 위치에 원하는 문자열을 삽입한다.
        sb.insert(5, "!");
        System.out.println(sb.toString());


        // substring : 특정 범위의 문자열을 추출한다. ( 슬라이싱 )
        StringBuffer sb2 = new StringBuffer("Hello java!");

        System.out.println(sb2.substring(0, 5));
    }
}
