import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class Check_Queries {

    public static void main(String[] args) throws Exception {
	BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] array;
        int N, Q;
        ArrayList<Long> list = new ArrayList<Long>();
        array = bi.readLine().split(" ");
            N = Integer.parseInt(array[0]);
            Q = Integer.parseInt(array[1]);

            line = bi.readLine();
            for (String numStr: line.split(" ")) {
                list.add(Long.parseLong(numStr));
            }

            while((line = bi.readLine()) != null) {
                boolean retval = list.contains(Long.parseLong(line));
                if(retval) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
     }
} 
