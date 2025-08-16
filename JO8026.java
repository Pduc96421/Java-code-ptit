package java_code_ptit;


import java.util.*;

public class JO8026 {
    public static int BFS(int s, int t){
        Queue<int[]> q = new LinkedList<>();
        Set<Integer> se = new HashSet<>();

        q.offer(new int[] {s, 0});
        se.add(s);

        while (!q.isEmpty()) {
            int[] a = q.poll();
            int x = a[0];
            int steps = a[1];

            if(x == t) return steps;
            if (x - 1 == t || x * 2 == t) return steps + 1;

            if (x - 1 > 0 && !se.contains(x - 1)){
                se.add(x - 1);
                q.offer(new int[]{x - 1, steps + 1});
            }

            if (x * 2 <= 2 * t && !se.contains(x * 2)){
                se.add(x * 2);
                q.offer(new int[] {x * 2, steps + 1});
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int S = sc.nextInt();
            int T = sc.nextInt();
            System.out.println(BFS(S, T));
        }
    }
}
