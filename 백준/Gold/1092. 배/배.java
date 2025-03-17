import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] cranes = new Integer[N];
        for (int i = 0; i < N; i++) {
            cranes[i] = sc.nextInt();
        }
        Arrays.sort(cranes, Collections.reverseOrder());

        int M = sc.nextInt();
        ArrayList<Integer> boxes = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            boxes.add(sc.nextInt());
        }
        Collections.sort(boxes, Collections.reverseOrder());

        if (boxes.get(0) > cranes[0]) {
            System.out.println(-1);
            return;
        }

        int time = 0;
        while (!boxes.isEmpty()) {
            int boxIdx = 0;
            int craneIdx = 0;

            while (craneIdx < N){
                if(boxIdx == boxes.size()) break;

                else if (cranes[craneIdx] >= boxes.get(boxIdx)) {
                    boxes.remove(boxIdx);
                    craneIdx++;
                }else{
                    boxIdx++;
                }
            }

            time++;
        }
        System.out.println(time);
    }
}
