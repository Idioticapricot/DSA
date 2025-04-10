public class JavaBasics{
    public static int calculateSum(int sum1,int sum2){
        
 
        int sum = sum1+sum2;
       return sum;
        

    }
    public static void Swap(int a, int b){

        
        int temp = a;
        a = b;
        b = temp;
        

    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
       // System.out.print("Enter A :");
       // int a = sc.nextInt();
       // System.out.print("Enter B :");
        //int b = sc.nextInt();

       // int sum = calculateSum(a,b);
       // System.out.println("The Sum is : "+ sum);
       int a = 10;
       int b = 20;

       Swap(a,b);
       System.out.println("a is : "+ a+ " b is : " + b);

    }
} 
 