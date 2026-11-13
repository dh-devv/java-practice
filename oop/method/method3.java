public class method3 {
    int a;  // 객체 변수 a

    void varTest() {
        this.a++;
    }

    public static void main(String[] args) {
        method3 test = new method3();

        test.a = 1;
        test.varTest();

        System.out.println(test.a);
    }
}