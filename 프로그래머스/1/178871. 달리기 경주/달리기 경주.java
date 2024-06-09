import java.util.HashMap;
class Solution {

    public String[] solution(String[] players, String[] callings) {
        String name;
        HashMap<String,Integer> a = new HashMap<>();

        for(int i =0; i< players.length; i++){
            a.put(players[i],i);
        }

        for(int i =0; i<callings.length; i++){
            int callingName = a.get(callings[i]);
            String player= players[callingName-1];

            players[callingName] = player;
            players[callingName-1] = callings[i];

            a.put(callings[i],callingName-1);
            a.put(player,callingName);

        }
        String[] answer = new String[players.length];
        for(int i =0; i< players.length; i++){
            answer[i] = players[i];
        }
        return answer;
    }
}