import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        Map<String, List<String>> teamMap = new HashMap<>();
        Map<String, String> memberMap = new HashMap<>();

        for(int i = 0; i < n; i++) {
            String team = sc.nextLine();
            int memberCount = sc.nextInt();
            sc.nextLine();

            List<String> members = new ArrayList<>();
            for(int j = 0; j < memberCount; j++) {
                String member = sc.nextLine();
                members.add(member);
                memberMap.put(member, team);
            }
            teamMap.put(team, members);
        }

        for(int i = 0; i < m; i++) {
            String member = sc.nextLine();
            int select = sc.nextInt();
            sc.nextLine();
            if(select == 0){

                List<String> members = teamMap.get(member);
                members.sort(String::compareTo);
                for(int j = 0; j < members.size(); j++) {
                    System.out.println(members.get(j));
                }
            }else if(select == 1){
                System.out.println(memberMap.get(member));
            }
        }
    }
}
