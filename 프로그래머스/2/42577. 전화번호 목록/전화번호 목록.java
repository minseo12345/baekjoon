import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Boolean> map = new HashMap<>();

        for (String number : phone_book) {
            map.put(number, true);
        }

        // 각 전화번호를 체크하여 접두어가 있는지 확인
        for (String number : phone_book) {
            for (int i = 1; i < number.length(); i++) {
                // 전화번호의 부분 문자열을 추출
                String prefix = number.substring(0, i);
                // 부분 문자열이 맵에 존재하면 false 반환
                if (map.containsKey(prefix)) {
                    return false;
                }
            }
        }

        return true; 
    }
}
