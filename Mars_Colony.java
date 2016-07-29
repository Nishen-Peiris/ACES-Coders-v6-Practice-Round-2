import java.io.*;
import java.util.*;

public class Mars_Colony {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, K;
        N = sc.nextInt();
        K = sc.nextInt();
        
        if(K % 2 == 1) {
            K -= 1;
        }
        
        if (N == K || K == 0) {
            System.out.println(1);
        }
        long l = 1;
        if (N - K < K) {
            K = N - K;
        }
        for (int i = 0; i < K; i++) {
            l *= (N - i);
            l /= (i + 1);
        }
        System.out.println(l % 1000000007);
        }
} 
