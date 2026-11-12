
class Animal {
    String name; // 객체 변수

    public void setName(String name) {
        this.name = name;
    }
}

public class AnimalClass {
    public static void main(String[] args) {
        Animal cat = new Animal(); // 객체 생성하기 ( 이름: cat)
        cat.setName("boby"); // cat 객체의 이름은 boby

        System.out.println(cat.name);

        Animal dog = new Animal(); // 새로운 객체
        dog.setName("happy");

        System.out.println(dog.name);

        /*
        dog.name 과 cat.name은 서로 공유되지 않는다.
          즉, 객체 변수의 값이 독립적으로 유지된다는 뜻이다. */
    }
}
