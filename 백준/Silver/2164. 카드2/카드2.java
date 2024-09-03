import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<Integer> q = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i<=n; i++){
            q.add(i);
        }

        while (q.size()>1){
            q.remove();
            q.add(q.remove());
        }

        
        System.out.println(q.peek());
    }
}
