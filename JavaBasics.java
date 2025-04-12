import java.util.*;
public class JavaBasics{
    public static void largest(int arr[])
    {
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }

        
        
           
        }
        System.out.println("Largest is " +largest);
        return;
        
    }
    public static void main(String[] args) {
       int arr[]={10,2,6,3,5};
       largest(arr);

    }
    


} 
 