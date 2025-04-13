import java.util.*;
public class JavaBasics{
    public static void pairs(int nums[])

 {
    for(int i =0;i<nums.length;i++){
        for(int n=i+1;n<nums.length;n++){
            System.out.println("Pair: (" + nums[i] + ", " + nums[n] + ")");
        }
    }
   
 }
    
    public static void main(String[] args) 
    {
        int nums [] = {2,4,6,8,10};
        pairs(nums);
       
    }
    


} 
 