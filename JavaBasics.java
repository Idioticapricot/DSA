import java.util.*;
public class JavaBasics{
    public static void calculateSum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int a = sc.nextInt();
        System.out.print("Enter B :");
        int b = sc.nextInt();
 
        int sum = a+b;
        System.out.println("The Sum is : "+ sum);
        

    }
    public static void PrintHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        //PrintHelloWorld();//function call
        calculateSum();
    }
}
