
class Aniaml {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal { // Animal 클래스를 상속한다.
    void sleep() {
        System.out.println(this.name + " zzz");
    }

}
public class inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("강아지");
        System.out.println(dog.name);

        dog.sleep();
    }
}