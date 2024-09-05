import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String a = br.readLine();
        int [] b = new int[a.length()];

       for(int i =0; i<a.length(); i++){
            b[i] = Integer.parseInt(a.substring(i,i+1));
       }

        for(int i =0; i<b.length; i++){
            int max = i;
            int temp = 0;
            for(int j =i+1; j<b.length; j++){
                if(b[j] > b[max]){
                    max = j;
                }
            }
            if(b[i]<b[max]){
                temp = b[i];
                b[i] = b[max];
                b[max] = temp;
            }

        }
        for (int i = 0; i<b.length; i++){
            System.out.print(b[i]);
        }
    }
}
