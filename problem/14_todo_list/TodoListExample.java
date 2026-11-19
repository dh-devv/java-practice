import java.util.ArrayList;

public class TodoListExample {
    public static void main(String[] args) {
        ArrayList<String> todo = new ArrayList<>();

        todo.add("Java 공부");
        todo.add("내신 공부");
        todo.add("Linux 명령어 복습");
        todo.add("Github 정리");

        System.out.print("전체 목록: ");
        System.out.println(todo);

        todo.remove(2);
        todo.add("자격증 준비");

        System.out.println("\n===== 최종 할 일 목록 =====\n");

        for (int i=0; i<todo.size(); i++) {
            System.out.println(i+1 + ". " + todo.get(i));
        }
    }
}