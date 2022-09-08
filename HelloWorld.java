import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int total = 1;
        for (int i = 0; i < pow; i++) {
            total*=num;
        }
        System.out.println(total);
        sc.close();
    }            
}