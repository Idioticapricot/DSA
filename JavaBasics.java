import java.util.*;
public class JavaBasics{
    public static void Bsearch(int arr[],int key)
    {
        int start = 0;
        int end = arr.length-1;
     
     while(start<=end){
        
        int mid = start + (end - start) / 2;;
        if(arr[mid] == key){
            System.out.print("found at :" +mid);
        }
        else if(arr[mid] > key){
            end = mid -2;
        }
        else{start=mid+1;}
        return;
     }
    }
    public static void main(String[] args) 
    {
        int arr[] ={2,4,6,8,10,12,14};
        int key = 8;
        Bsearch(arr, key);
    }
    


} 
 