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
        int n = Integer.parseInt(br.readLine());

        List<BigInteger> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = br.readLine(); 
            StringBuilder num = new StringBuilder();

            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);

                if (Character.isDigit(c)) {
                    num.append(c);
                } else {
   
                    if (num.length() > 0) {
                        numbers.add(new BigInteger(num.toString()));
                        num.setLength(0);
                    }
                }
            }
            
            if (num.length() > 0) {
                numbers.add(new BigInteger(num.toString()));
            }
        }


        Collections.sort(numbers);

   
        for (BigInteger number : numbers) {
            System.out.println(number);
        }
    }
}
