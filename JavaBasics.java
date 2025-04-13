import java.util.*;
public class JavaBasics{
    public static void maxsubarray(int nums[])

 {
    int maxsum=Integer.MIN_VALUE;;
    
    int prefix[]= new int[nums.length];
    prefix[0]=nums[0];
    for (int i=1;i<nums.length;i++){
        prefix[i]=prefix[i-1]+nums[i];
    }
    for(int a=0;a<nums.length;a++){
        int currsum =0;
        int start = a;
        for(int b=a;b<nums.length;b++){
            int end = b;
             currsum = start == 0 ? prefix[end]:   prefix[end] - prefix[start -1];

             if(maxsum < currsum){
                maxsum=currsum;
             }
            
        }
        
        
        


    }
    System.out.println("max sum =" + maxsum);
    
   
 }
    
    public static void main(String[] args) 
    {
        int nums [] = {1,-2,6,-1,3};
        maxsubarray(nums);

    }
    


} 
 