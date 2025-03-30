import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        LinkedList<int[]> balloons = new LinkedList<>();
        
        for (int i = 0; i < N; i++) {
            balloons.add(new int[]{i + 1, sc.nextInt()});
        }

        StringBuilder result = new StringBuilder();
        ListIterator<int[]> iter = balloons.listIterator();

        int[] first = iter.next();
        result.append(first[0]).append(" ");
        int move = first[1];
        iter.remove();

        while (!balloons.isEmpty()) {
            if (move > 0) { 
                for (int i = 0; i < move - 1; i++) {
                    if (!iter.hasNext()) iter = balloons.listIterator(); 
                    iter.next();
                }
            } else { 
                for (int i = 0; i < -move; i++) {
                    if (!iter.hasPrevious()) iter = balloons.listIterator(balloons.size());  
                    iter.previous();
                }
            }

            if (!iter.hasNext()) iter = balloons.listIterator(); 

            int[] current = iter.next();
            result.append(current[0]).append(" ");
            move = current[1];
            iter.remove();
        }

        System.out.println(result.toString().trim());
    }
}
