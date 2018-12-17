package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {


        Scanner kbReader = new Scanner(System.in);
        System.out.println("Welcome to tic tac toe");
        System.out.println("|"+"\t"+"|"+"\t"+"|"+"\t"+"|"+"\n"+""+"\n"+"|"+"\t"+"|"+"\t"+"|"+"\t"+"|"+"\t"+"\n"+"\n"+"|"+"\t"+"|"+"\t"+"|"+"\t"+"|");
        int cols = 3;int rows = 3;
        int [][] array = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                array[i][j]=0;

            }
            
        }


    }
}
