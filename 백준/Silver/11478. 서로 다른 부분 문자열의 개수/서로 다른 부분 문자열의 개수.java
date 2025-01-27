import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();

        for(int i =0; i<s.length(); i++){
        for(int j = i+1; j<=s.length(); j++){
            if(!map.containsKey(s.substring(i,j))){
                 map.put(s.substring(i,j),1);
                }
            }
        }
        System.out.println(map.size());
    }
}
