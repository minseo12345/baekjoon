import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();

        int[] count = new int[26]; 
        for (char c : word.toCharArray()) {
            count[c - 'A']++; 
        }

        int maxCount = 0;
        char maxChar = '?';
        boolean isDuplicate = false;

        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) ('A' + i);
                isDuplicate = false;
            } else if (count[i] == maxCount) {
                isDuplicate = true; 
            }
        }

        System.out.println(isDuplicate ? "?" : maxChar);
    }
}
