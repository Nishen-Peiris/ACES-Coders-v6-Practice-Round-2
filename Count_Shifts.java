import java.io.*;
import java.util.*;

public class Count_Shifts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] array = new int[N];
            
            for(int j = 0; j < N; j++) {
                array[j] = sc.nextInt();
            }
            
            // insertion sort
            int k; // number of sorted items
            int key; // the item to be inserted
            int l;  
            for (k = 1; k < array.length; k++) {
                key = array[k];
                for(l = k-1; (l >= 0) && (array[l] > key); l--) {
                    array[l+1] = array[l];
                    count++;
                }
                array[l+1] = key;
            }
            
            /*for(int j = 0; j < N; j++) {
                System.out.println(array[j]);
            }*/
            
            System.out.println(count);
            count = 0;
        }
    }
} 
