
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int h =3;
        int w = 1;

        dfs(brown + yellow,h,w,yellow,answer);
        return answer;
    }
    public int[] dfs(int sum,int h, int w, int yellow, int [] area){
        for( int i = h; i<=sum; i++){
            if(sum % i == 0){
                w = sum / i;
                h = i;
                if((w-2) * (h -2 ) == yellow){
                    area [0] = w;
                    area [1] = h;
                    break;
                }
            }
        }

        return area;
    }
}