import java.util.*;

class Solution {

    class Pair {
        int x, y, cost;

        Pair(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }

    public boolean findSafeWalk(List<List<Integer>> grid, int health) {

        int n = grid.size();
        int m = grid.get(0).size();

        int[][] dist = new int[n][m];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);

        dist[0][0] = grid.get(0).get(0);
        pq.offer(new Pair(0, 0, dist[0][0]));

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        while (!pq.isEmpty()) {

            Pair cur = pq.poll();

            if (cur.cost > dist[cur.x][cur.y])
                continue;

            for (int i = 0; i < 4; i++) {

                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m)
                    continue;

                int newCost = cur.cost + grid.get(nx).get(ny);

                if (newCost < dist[nx][ny]) {
                    dist[nx][ny] = newCost;
                    pq.offer(new Pair(nx, ny, newCost));
                }
            }
        }

        return dist[n - 1][m - 1] < health;
    }
}