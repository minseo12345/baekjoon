import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> a = new Stack<>();
        int[] b = new int[n];
        
        for(int i =0; i<n; i++){
            b[i] = Integer.parseInt(br.readLine());
        }

        int num = 1;
        boolean result = true;

        StringBuffer bf = new StringBuffer();
        for(int i =0; i<b.length; i++){
            int su = b[i];

            if(su >= num){
                while (su>=num){
                    a.push(num++);
                    bf.append("+\n");
                }
                a.pop();
                bf.append("-\n");
            }else{
                int m = a.pop();
                if(m > su){
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    bf.append("-\n");
                }
            }
        }
        if(result) System.out.println(bf.toString());
    }
}
