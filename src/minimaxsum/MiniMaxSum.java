/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimaxsum;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author zukhruf
 */
public class MiniMaxSum {

    /**
     * @param args the command line arguments
     */
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
         int[] arr = new int[5];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
    static void miniMaxSum(int[] arr) {
        long resultMax = 0;
        long resultMin = 0; 
        long temp = 0;
        int arrLength = arr.length;
        for(int i = 0; i < arrLength; i++){
            for (int j = 0; j < arrLength; j++){
                if (j != i){
                    temp = arr[j] + temp;
                }
            }
            // System.out.println("temp = "+temp);
            if(resultMax == 0){
                resultMax = temp;
                resultMin = temp;
            }
            else if(temp > resultMax){
                resultMax = temp;
                temp = 0;
            }else if (temp < resultMin){
                resultMin = temp;
                temp = 0;
            }
            temp = 0;
        }
        System.out.println(resultMin + " " + resultMax);
       
        
    }
    
}
