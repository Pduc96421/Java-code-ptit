package java_code_ptit.J02102;

import java.util.Arrays;
import java.util.Scanner;

public class J02102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n * n];
        for(int i = 0; i < n * n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int res[][] = new int[n][n];
        int row = n;
        int cnt = 0, x = 0;
        while (cnt < n * n) {
            for (int i = x; i < row; i++)
                res[x][i] = a[cnt++];
            for (int i = x + 1; i < row; i++)
                res[i][row - 1] = a[cnt++];
            for (int i = row - 2; i >= x; i--)
                res[row - 1][i] = a[cnt++];
            for (int i = row - 2; i > x; i--)
                res[i][x] = a[cnt++];
            row--;
            x++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
