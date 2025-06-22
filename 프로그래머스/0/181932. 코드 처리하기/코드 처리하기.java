class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if (mode == 0) {
                if (ch == '1') {
                    mode = 1;
                } else if (i % 2 == 0) {
                    ret.append(ch);
                }
            } else { // mode == 1
                if (ch == '1') {
                    mode = 0;
                } else if (i % 2 == 1) {
                    ret.append(ch);
                }
            }
        }

        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}
