/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;
import sample.util.ArrayUtil;
/**
 *
 * @author Admin
 */
public class Sample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] nums={1,1,1,2,2,2,4,5,5,66,7,4,5,6,7};
       
      
       
       
       for(int i=0;i<nums.length;i++){
           
           System.out.println(nums[i] +  " = " + ArrayUtil.counter(nums[i], nums));
       }
        
       
    }
    
}
