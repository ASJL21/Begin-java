import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
       
        try (// if else statement conditions
        Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();

            if(age> 18) {
                System.out.println("adult");
            } 
            else {
                System.out.println("not adult");
            }

            // odd or even
            int number = sc.nextInt();
            if(number % 2 ==0){
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }

            // largest of two numbers 
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(a==b){
                System.out.println("a is equal to b ");
            } else if(a>b) {
                  System.out.println(" a is largest"); 
                } 
                
            else {
                     System.out.println(" b is largest");
             }
        }
        
        
    }
        
    }



    
    

