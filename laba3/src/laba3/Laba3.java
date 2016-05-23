
package laba3;

import java.util.Scanner;


public class Laba3 {

    
    public static void main(String[] args) {
        int c, d, n, pasw;
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Введите кол-во чисел");
        n = scanner.nextInt();
        
        int array[] = new int[n];
        
        
        
        for (c=0; c<n; c++) array[c] = scanner.nextInt();
        
        for (c=0; c<(n-1); c++){
            for (d=0; d<n-c-1; d++){
                if (array[d]>array[d+1])
                {
                    pasw = array[d];
                    array[d] = array[d+1];
                    array[d+1] = pasw;
                
                }
            }
        }
        
    }
}
