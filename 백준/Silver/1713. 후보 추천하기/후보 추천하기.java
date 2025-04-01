import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int K = sc.nextInt();

        List<Integer> frames = new ArrayList<>();
        Map<Integer, Integer> votes = new HashMap<>();

        for (int i = 0; i < K; i++) {
            int student = sc.nextInt();

            if (votes.containsKey(student)) {
                votes.put(student, votes.get(student) + 1);
                continue;
            }

            if (frames.size() == N) {
                int minVotes = Integer.MAX_VALUE;
                int remove = -1;

                for (int s : frames) {
                    if (votes.get(s) < minVotes) {
                        minVotes = votes.get(s);
                        remove = s;
                    }
                }

                frames.remove((Integer) remove);
                votes.remove(remove);
            }
            frames.add(student);
            votes.put(student, 1);
        }

        Collections.sort(frames);
        for (int student : frames) {
            System.out.print(student + " ");
        }
    }
}
