import java.util.*;
public class JavaBasics{
    public static void maxsubarray(int nums[])

 {
    int cursum =0;
    int maxsum = 0;

    for (int i =0 ; i < nums.length ; i++){
        
        cursum += nums [i];
        if(cursum < 0) cursum = 0;
        maxsum = Math.max(maxsum, cursum);
       
         
    }
    System.out.println("max sum is : " + maxsum);
    
    
   
 }
    
    public static void main(String[] args) 
    {
        int nums [] = {-2,-3,4,-1,-2,1,5,-3};
        maxsubarray(nums);

    }
    


} 
 