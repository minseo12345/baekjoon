import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();

        int wordValue = 0;
        for (char c : word.toCharArray()) {
            if (Character.isLowerCase(c)) {
                wordValue += (c - 'a' + 1);
            } else if (Character.isUpperCase(c)) {
                wordValue += (c - 'A' + 27);
            }
        }

        if (isPrime(wordValue)) {
            System.out.println("It is a prime word.");
        } else {
            System.out.println("It is not a prime word.");
        }
    }

    static boolean isPrime(int n) {
        if(n == 1) return true;
        if(n < 1) return false;
        for(int i = 2; i * i<=n; i++){
            if(n % i == 0){ return false; }
        }
        return true;
    }
}
