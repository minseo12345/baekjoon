import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static final int Max = 100000; // 최대값 수정
    static int[] time = new int[Max + 1]; // 크기 100,001로 설정

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 배열 초기화
        for (int i = 0; i <= Max; i++) {
            time[i] = -1;
        }

        // BFS 호출
        System.out.println(bfs(N, M));
    }

    private static int bfs(int N, int M) {
        Queue<Integer> q = new LinkedList<>();
        q.add(N);
        time[N] = 0; // 초기 위치 시간 설정

        while (!q.isEmpty()) {
            int cur = q.poll();

            // 목표 위치 도달
            if (cur == M) {
                return time[cur];
            }

            // 이동 가능한 위치 계산
            int[] nextPositions = {cur - 1, cur + 1, cur * 2};
            for (int next : nextPositions) {
                if (next >= 0 && next <= Max && time[next] == -1) { // 범위 조건 수정
                    time[next] = time[cur] + 1;
                    q.add(next);
                }
            }
        }
        return -1; // 탐색 실패 (실제 문제에서는 발생하지 않음)
    }
}
