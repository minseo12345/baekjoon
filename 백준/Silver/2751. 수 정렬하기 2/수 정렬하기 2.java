import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        for(int i =0; i<a.length; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        sort(a,0,a.length-1);

        for(int i =0; i<a.length; i++){
            bw.write(a[i]+"\n");
        }
        bw.close();
        br.close();
    }

    public static void sort(int [] a, int left, int right){
        if(left ==right){
            return;
        }

        int mid = (left+right)/2;

        sort(a,left,mid);
        sort(a,mid+1,right);

        merge(a,left,mid,right);
    }

    public static void merge(int [] a, int left, int mid, int right){
        int n1 = mid -left +1;//왼쪽 배열의 길이
        int n2 = right - mid; // 오른쪽 배열의 길이

        int [] leftTemp = new int[n1];
        int [] rightTemp = new int[n2];

        for(int i =0; i<n1; i++){
            leftTemp[i] = a[left +i];
        }
        for(int i =0; i<n2; i++){
            rightTemp[i] = a[mid+1+i];
        }
        //왼쪽 배열과 오른쪽 배열의 인덱스
        int i =0 , j=0;
        // 원본 배열 a의 시작 인덱스
        int k = left;

        while(i < n1 && j <n2){
            if(leftTemp[i] <= rightTemp[j]){
                a[k] = leftTemp[i];
                i++;
            }else{
                a[k] = rightTemp[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            a[k] = leftTemp[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k] = rightTemp[j];
            j++;k++;
        }

    }

}
