class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // 각 쿼리에 대해 첫 번째 인덱스와 두 번째 인덱스의 값을 서로 교환
        for (int i = 0; i < queries.length; i++) {
            int idx1 = queries[i][0];
            int idx2 = queries[i][1];
            
            // 교환 작업
            int tmp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = tmp;
        }
        return arr;
    }
}
