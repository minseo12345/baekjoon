class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) { 
            int n = 0; 
            
            for (int k = 0; k < photo[i].length; k++) { 
                for (int j = 0; j < name.length; j++) {
                    if (name[j].equals(photo[i][k])) {
                        n += yearning[j];
                    }
                }
            }
            answer[i] = n;
        }

        return answer;
    }
}
