
package laba3;

import java.util.Scanner;


public class Laba3 {

    
    public static void main(String[] args) {
        int c, d, n, swap;
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Введите кол-во чисел");
        n = scanner.nextInt();
        
        int array[] = new int[n];
        
        System.out.println("Введите"+n+" число");
        
        for (c=0; c<n; c++) array[c] = scanner.nextInt();
        
        for (c=0; c<(n-1); c++){
            for (d=0; d<n-c-1; d++){
                if (array[d]>array[d+1])
                {
                    swap = array[d];
                    array[d] = array[d+1];
                    array[d+1] = swap;
                
                }
            }
        }
        
    }
}
