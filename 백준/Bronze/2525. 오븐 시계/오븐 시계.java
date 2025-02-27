import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int totalMinutes = A * 60 + B + C;
        int newHour = (totalMinutes / 60) % 24;
        int newMinute = totalMinutes % 60;
        
        System.out.println(newHour + " " + newMinute);
        
        sc.close();
    }
}
