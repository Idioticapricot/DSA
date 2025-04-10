
import java.util.Scanner;

public class JavaBasics{
   public static int product(int a,int b){
    int product = a*b;
    return product ;
   }
    public static void main(String[] args) {
       System.out.println("Enter A :");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter A :");
       int a = sc.nextInt();
       System.out.println("Enter b :");
       int b = sc.nextInt();
       int prod = product(a, b);
       System.out.println("Product  = "+prod);

       

    }
} 
 