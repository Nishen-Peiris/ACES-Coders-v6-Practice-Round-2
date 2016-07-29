import java.io.*;
import java.util.*;

public class Message_in_Roman_Wars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String encrypted;
        
        for(int i = 0; i < N; i++) {
            encrypted = sc.nextLine();
            char[] char_encrypted = encrypted.toCharArray();
            
            int difference = (int)char_encrypted[char_encrypted.length - 1] - (int)'u';
            
            
            for (int j = 0; j < char_encrypted.length; j++) {
                char_encrypted[j] -= difference;
                if(char_encrypted[j] < 97) {
                    char_encrypted[j] = (char)(123 - (97 - (int)char_encrypted[j]));
                } else if (char_encrypted[j] > 122) {
                    char_encrypted[j] = (char)((int)97 + (char_encrypted[j] - (int)123));
                }
            }

            String decrypted = String.valueOf(char_encrypted);
            decrypted = decrypted.substring(0, decrypted.length()-1);
            System.out.println(decrypted);
        }
    }
} 
