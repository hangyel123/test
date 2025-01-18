import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String c;
        int a,b;

        c = sc.next().charAt(0);
        a= sc.nextInt();
        b = sc.nextInt();

        System.out.printf("%c\n%d\n%d",c,a,b);
    }
}