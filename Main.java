import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables
        int a = 10;
        int b = 25;
        int sum = a + b;
        System.out.println("the sum of a and b is\n" +sum);
        int diff = b - a;
        System.out.println(diff);

        // to take input from user we use a classcalled Scanner
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
        sc.close();

        
    }
    
}
