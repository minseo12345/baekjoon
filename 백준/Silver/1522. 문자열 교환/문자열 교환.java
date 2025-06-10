import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = str.length();

        int cntA = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'a') cntA++;
        }

        if (cntA == 0 || cntA == n) {
            System.out.println(0);
            return;
        }


        String doubled = str + str;
        int windowB = 0;

        for (int i = 0; i < cntA; i++) {
            if (doubled.charAt(i) == 'b') windowB++;
        }

        int minB = windowB;


        for (int i = cntA; i < doubled.length(); i++) {
            if (doubled.charAt(i - cntA) == 'b') windowB--;
            if (doubled.charAt(i) == 'b') windowB++;
            minB = Math.min(minB, windowB);
        }

        System.out.println(minB);
    }
}
