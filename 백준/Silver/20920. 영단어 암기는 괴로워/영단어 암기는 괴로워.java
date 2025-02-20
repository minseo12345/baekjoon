import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); 
        int m = Integer.parseInt(st.nextToken()); 

        Map<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (word.length() >= m) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
        List<String> words = new ArrayList<>(wordCount.keySet());
        
        words.sort((a, b) -> {
            int freqCompare = Integer.compare(wordCount.get(b), wordCount.get(a));
            if (freqCompare != 0) return freqCompare;
            int lengthCompare = Integer.compare(b.length(), a.length()); 
            if (lengthCompare != 0) return lengthCompare;
            return a.compareTo(b); 
        });

        for (String word : words) {
            bw.write(word);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
