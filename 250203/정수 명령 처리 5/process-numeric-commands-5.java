import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
 Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // 명령 수 입력
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.next();
            
            switch (command) {
                case "push_back":
                    int value = scanner.nextInt();
                    list.add(value);
                    break;

                case "get":
                    int index = scanner.nextInt();
                    // 1부터 시작하는 인덱스이므로 -1
                    System.out.println(list.get(index - 1));
                    break;

                case "size":
                    System.out.println(list.size());
                    break;

                case "pop_back":
                    if (!list.isEmpty()) {
                        list.remove(list.size() - 1);
                    }
                    break;

                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
        
        scanner.close();
        
    }
}