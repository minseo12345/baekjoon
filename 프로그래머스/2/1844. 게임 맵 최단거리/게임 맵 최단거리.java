import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        // 이동할 네 방향 (상, 하, 좌, 우)
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // 방문 여부를 체크하기 위한 큐
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0}); // 시작점 추가

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            // 네 방향으로 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 지도 범위를 벗어나지 않고, 벽이 아니며, 아직 방문하지 않은 위치인지 확인
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1) {
                    maps[nx][ny] = maps[x][y] + 1; // 거리 누적
                    queue.add(new int[]{nx, ny});
                }
            }
        }

        // 상대팀 진영의 좌표가 초기 값 그대로이면 도달 불가 (-1 반환)
        return maps[n - 1][m - 1] == 1 ? -1 : maps[n - 1][m - 1];
    }
}
