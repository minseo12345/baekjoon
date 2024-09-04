import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 0; i< a.length-1; i++){
            for(int j =0; j<a.length-1-i; j++){
                if(a[j] >a[j+1] ){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for(int i =0;i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
