import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
      // for loop 
      // for(initialisation; condition;updation){ do something}  
        for(int counter  = 0; counter <3; counter++){
            System.out.println("hello world");
        }

        for(int i = 0; i <11; i++){
            System.out.print(i+" ");
            System.out.println(i+" ");
        }

        while loops
        while(conditon){}

        int i = 0;
        while(i < 11){
            System.out.println(i);
            i = i+ 1; //i ++
        }

        do while loops

        do{
            //do something 

        } while condition;
        int j = 0;
        do {
            System.out.print(j);
            j = j + 1;
        } while(j < 11 );
         
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt ();

        int sum = 0;
        for(int i = 0; i<= n; i ++){
            sum = sum + i;
        }
        System.out.println(sum);



    }
    
}
