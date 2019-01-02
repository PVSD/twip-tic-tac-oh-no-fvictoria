package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {


        Scanner kbReader = new Scanner(System.in);
        int row = 3, column = 3;
        char P1 = 'X';
        char P2 = 'O';
        char [][] board = new char [row][column];
        char ch = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j]= ch++;
            }
        }

        System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]+"\n"+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+"\n"+
        board[2][0]+" | "+board[2][1]+" | "+board[2][2]);
        System.out.println("");
        System.out.println("Player "+P1+": Enter a row and a column 0, 1 or 2");
        row = kbReader.nextInt();
        column = kbReader.nextInt();

        if (board[row][column]=='X' || (board[row][column]=='O'))
        {
            System.out.println("Spot is already taken, please choose another");
        }
        board[row][column] = P1;
        System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]+"\n"+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+"\n"+
                board[2][0]+" | "+board[2][1]+" | "+board[2][2]);

        System.out.println("Player "+P2+": Enter a row and a column 0, 1 or 2");
        row = kbReader.nextInt();
        column = kbReader.nextInt();

        board[row][column] = P2;
        System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]+"\n"+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+"\n"+
                board[2][0]+" | "+board[2][1]+" | "+board[2][2]);

        System.out.println("Player "+P1+": Enter a row and a column 0, 1 or 2");
        row = kbReader.nextInt();
        column = kbReader.nextInt();

        board[row][column] = P1;
        System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]+"\n"+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+"\n"+
                board[2][0]+" | "+board[2][1]+" | "+board[2][2]);

        System.out.println("Player "+P2+": Enter a row and a column 0, 1 or 2");
        row = kbReader.nextInt();
        column = kbReader.nextInt();

        board[row][column] = P2;
        System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]+"\n"+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+"\n"+
                board[2][0]+" | "+board[2][1]+" | "+board[2][2]);

        System.out.println("Player "+P1+": Enter a row and a column 0, 1 or 2");
        row = kbReader.nextInt();
        column = kbReader.nextInt();

        board[row][column] = P1;
        System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]+"\n"+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+"\n"+
                board[2][0]+" | "+board[2][1]+" | "+board[2][2]);

        System.out.println("Player "+P2+": Enter a row and a column 0, 1 or 2");
        row = kbReader.nextInt();
        column = kbReader.nextInt();

        board[row][column] = P2;
        System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]+"\n"+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+"\n"+
                board[2][0]+" | "+board[2][1]+" | "+board[2][2]);


        System.out.println("Player "+P1+": Enter a row and a column 0, 1 or 2");
        row = kbReader.nextInt();
        column = kbReader.nextInt();

        board[row][column] = P1;
        System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]+"\n"+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+"\n"+
                board[2][0]+" | "+board[2][1]+" | "+board[2][2]);

        System.out.println("Player "+P2+": Enter a row and a column 0, 1 or 2");
        row = kbReader.nextInt();
        column = kbReader.nextInt();

        board[row][column] = P2;
        System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]+"\n"+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+"\n"+
                board[2][0]+" | "+board[2][1]+" | "+board[2][2]);

        System.out.println("Player "+P1+": Enter a row and a column 0, 1 or 2");
        row = kbReader.nextInt();
        column = kbReader.nextInt();

        board[row][column] = P1;
        System.out.println(board[0][0]+" | "+board[0][1]+" | "+board[0][2]+"\n"+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+"\n"+
                board[2][0]+" | "+board[2][1]+" | "+board[2][2]);




    }
}
