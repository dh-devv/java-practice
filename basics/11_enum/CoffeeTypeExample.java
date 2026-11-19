public class CoffeeTypeExample {
    
    enum CoffeeType { // 열거형 CoffeeType 생성하기
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };
    
    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO); 

        for (CoffeeType type : CoffeeType.values()) {
            System.out.println(type);
        }
    }
}
