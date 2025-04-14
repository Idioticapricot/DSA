import java.util.*;
public class JavaBasics{
    public static void rainwater(int height[])

 {

    
    int trapped =0;
    

    for( int i = 0; i < height.length; i++){
        int maxl = 0;
        int maxr = 0;
        int left =0;
        int right =0;
        int waterlevel =0;
        
        for( int l = i; l>= 0 ; l--){
        left = height[l];
        
            if(maxl < left) maxl = left;
        }
        for (int r =i ; r < height.length; r++)
        {
        right  = height[r];
        if(maxr < right) maxr = right;
        }
        int waterLevel = Math.min(maxl, maxr);
            if (waterLevel > height[i]) {
                trapped += waterLevel - height[i];
}



        
        
    }
    
    
    
    
    
   
 }
    
    public static void main(String[] args) 
    {
        int height [] = {4,2,0,6,3,2,5};
        rainwater(height);
        

    }
    


} 
 