import java.util.*;

class Solution {
    public long solution(long n) {
        List<Integer> a = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        while (n > 0) {
            a.add((int) (n % 10));
            n /= 10;
        }

        // 큰 순서대로 정렬
        Collections.sort(a, Collections.reverseOrder());

        for (int c : a) {
            stringBuilder.append(c);
        }

        // 정렬된 문자열을 다시 long으로 변환
        return Long.parseLong(stringBuilder.toString());
    }
}
