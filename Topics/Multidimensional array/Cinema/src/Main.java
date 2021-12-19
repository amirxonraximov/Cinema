import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            count = 0;

            for (int j = 0; j < m; j++) {

                if (arr[i][j] == 1) {
                    count = 0;
                    continue;
                }
                count++;

                if (count == k) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}