class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        int end = section[0] + (m-1);
        int arr = 1;

        for(int i : section){
            if(i>=start &&i<=end){
                continue;
            }
            start = i;
            end = i + (m-1);
            arr++;

        }

        return arr;
    }
}