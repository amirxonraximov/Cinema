import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        String[][] array = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = ".";

                if (i == n / 2){
                    array[i][j] = "*";
                }

                if (j == n / 2){
                    array[i][j] = "*";
                }

                if (i == j){
                    array[i][j] = "*";
                }

                if (i + j == n -1){
                    array[i][j] = "*";
                }
            }
        }
        print(array);
    }

    public static void print(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

