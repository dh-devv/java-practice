public class function {
    public static void main(String[] args) {
        String text = "This is a sample string.";
        String text2 = "This is a sample string.";
        String text3 = "THIS";

        // equals : 문자열 2개가 같은 지 비교한 후 불리안으로 반환
        System.out.println(text.equals(text2)); // true
        System.out.println(text.equals(text3)); // false


        // indexOf : 특정 문자열이 시작되는 인덱스 값을 반환한다.
        System.out.println(text.indexOf("sample")); // 10


        // contains : 문자열에서 특정 문자열이 포함되어 있는 지 확인 후 불리안으로 반환
        System.out.println(text.contains("sample")); // true
        System.out.println(text.contains(text3)); // false


        // charAt : 특정 위치의 문자를 반환한다.
        System.out.println(text.charAt(3));


        // replaceAll : 특정 문자열을 다른 문자열로 변경한다.
        System.out.println(text.replaceAll("sample", "example")); // This is a example string.


        // substring : 특정 문자열을 잘라낸다. ( 문자열 슬라이싱 )
        System.out.println(text.substring(1, 5)); // his
        

        /*
        toUpperCase : 문자열을 대문자로 변경한다.
        toLowerCase : 문자열을 소문자로 변경한다.
        */ 

        System.out.println(text3.toLowerCase()); // this
        System.out.println(text.toUpperCase()); // THIS IS A SAMPLE STRING.


        // split : 문자열을 특정한 구분자로 나누어 문자열 배열로 리턴한다.
        String[] resutl = text.split(" "); // retult = {"This", "is", "a", "sample", "string."}
    }
}