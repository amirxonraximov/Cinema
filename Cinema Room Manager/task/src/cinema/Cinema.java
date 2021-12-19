package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int column = sc.nextInt();
        String[][] seats = initSeats(row, column);
        printSeats(seats);
        System.out.println("Enter a row number:");
        row = sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        column = sc.nextInt();
        markSeat(row, column, seats);
        printSeats(seats);
    }

    public static String[][] initSeats(int row, int column) {
        String[][] seats = new String[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                seats[i][j] = "S";
            }
        }
        return seats;
    }

    public static void printSeats(String[][] seats) {
        System.out.println("Cinema:");
        for (int i = 0; i <= seats[0].length; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < seats.length; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < seats[0].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void markSeat(int row, int column, String[][] seats) {
        int allSeats = seats.length * seats[0].length;
        if (allSeats > 60) {
            if (row <= seats.length / 2) {
                System.out.printf("Ticket price: $%d", 10);
            } else {
                System.out.printf("Ticket price: $%d", 8);
            }
        } else {
            System.out.printf("Ticket price: $%d", 10);
        }
        System.out.println();
        seats[--row][--column] = "B";
    }
}