import java.util.*;
public class JavaBasics{
    public static void find(int key,int arr[])
    {
        for (int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("found at : "+arr[i]);
                break;
                }
                
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,5,7,8,9};
        int key = 1;
        find(key,arr);

    }
    


} 
 