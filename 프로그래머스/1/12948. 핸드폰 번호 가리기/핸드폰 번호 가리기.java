class Solution {
    public String solution(String phone_number) {
        String answer = "";

        char [] a = phone_number.toCharArray();

        for(int i = 0; i < a.length-4; i++){
            a[i] = '*';
        }

        answer = String.valueOf(a);

        return answer;
    }
}