/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.util;

/**
 *
 * @author Admin
 */
public class ArrayUtil {

    public static int[] swap(int[] data,boolean asc) {
        for (int x = 0; x < data.length; x++) {
            for (int y = x + 1; y < data.length; y++) {
                if(asc){
                    if (data[x] > data[y]) {
                        int temp = data[x];
                        data[x] = data[y];
                        data[y] = temp;
                    }
                }
                else{
                    if (data[x] < data[y]) {
                        int temp = data[x];
                        data[x] = data[y];
                        data[y] = temp;
                    }                    
                }
            }
        }
        return data;
    }
    
    public static int counter(int num,int[] data){
        int count=0;
        for(int i=0;i<data.length;i++){
            if(data[i]==num){
                count++;
            }
        }
        return count;
    }

}
