package java_code_ptit;

import java.util.*;

public class J08025 {
    static class Pair{
        int[][] ar;
        int dem;

        Pair(int[][] ar, int dem){
            this.ar = ar;
            this.dem = dem;
        }
    }

    public static int[][] xoay_matran(int[][] a, int x){
        int temp = a[0][x + 0];
        a[0][x + 0] = a[1][x + 0];
        a[1][x + 0] = a[1][x + 1];
        a[1][x + 1] = a[0][x + 1];
        a[0][x + 1] = temp;
        return a;
    }

    public static String chuan_hoa(int[][] a){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                sb.append(a[i][j]);
            }
        }
        return sb.toString();
    }

    public static void BFS(int[][] begin, int[][] end){
        Queue<Pair> queue = new LinkedList<>();
        Set<String> se = new HashSet<>();

        queue.offer(new Pair(begin, 0));
        se.add(chuan_hoa(begin));

        while (!queue.isEmpty()){
            Pair a = queue.poll();
            int[][] x = a.ar;
            int steps = a.dem;
            String x1 = chuan_hoa(x);
            String x2 = chuan_hoa(end);

//            if (x1.equals(x2)) return steps;
            System.out.println(x1 + " " + steps);
            int[][] a1 = xoay_matran(x, 0);
            String s = chuan_hoa(a1);
            if (!se.contains(s)){
                se.add(s);
                queue.offer(new Pair(a1, steps + 1));
            }
//            System.out.println(x1);
            int[][] a2 = xoay_matran(x, 1);
            String e = chuan_hoa(a2);
            if (!se.contains(e)){
                se.add(e);
                queue.offer(new Pair(a2, steps + 1));
            }
        }

//        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int[][] begin = new int[2][3];
            int[][] end = new int[2][3];

            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 3; j++){
                    begin[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < 2; i++){
                for(int j = 0; j < 3; j++){
                    end[i][j] = sc.nextInt();
                }
            }
            BFS(begin, end);
//            System.out.println(BFS(begin, end));
        }
        sc.close();
    }
}
