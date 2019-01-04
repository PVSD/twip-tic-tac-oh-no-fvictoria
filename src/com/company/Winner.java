package com.company;

import java.util.Objects;

public class Winner {

    public Winner() {

    }

    public static boolean WinCheckerO(char win[][]) {
        if (Objects.equals('O', win[0][0]) && (Objects.equals('O', win[0][1]) && (Objects.equals('O', win[0][2])))) {
            return true;
        }

        if (Objects.equals('O', win[1][0]) && (Objects.equals('O', win[1][1]) && (Objects.equals('O', win[1][2])))) {
            return true;
        }

        if (Objects.equals('O', win[2][0]) && (Objects.equals('O', win[2][1]) && (Objects.equals('O', win[2][2])))) {
            return true;
        }

        if (Objects.equals('O', win[0][0]) && (Objects.equals('O', win[1][0]) && (Objects.equals('O', win[2][0])))) {
            return true;
        }

        if (Objects.equals('O', win[0][1]) && (Objects.equals('O', win[1][1]) && (Objects.equals('O', win[2][1])))) {
            return true;
        }

        if (Objects.equals('O', win[0][2]) && (Objects.equals('O', win[1][2]) && (Objects.equals('O', win[2][2])))) {
            return true;
        }

        if (Objects.equals('O', win[2][0]) && (Objects.equals('O', win[1][1]) && (Objects.equals('O', win[0][2])))) {
            return true;
        }
        return false;
    }

    public static boolean WinCheckerX(char Xwin[][]) {
        if (Objects.equals('X', Xwin[0][0]) && (Objects.equals('X', Xwin[0][1]) && (Objects.equals('X', Xwin[0][2])))) {
            return true;
        }

        if (Objects.equals('X', Xwin[1][0]) && (Objects.equals('X', Xwin[1][1]) && (Objects.equals('X', Xwin[1][2])))) {
            return true;
        }

        if (Objects.equals('X', Xwin[2][0]) && (Objects.equals('X', Xwin[2][1]) && (Objects.equals('X', Xwin[2][2])))) {
            return true;
        }

        if (Objects.equals('X', Xwin[0][0]) && (Objects.equals('X', Xwin[1][0]) && (Objects.equals('X', Xwin[2][0])))) {
            return true;
        }

        if (Objects.equals('X', Xwin[0][1]) && (Objects.equals('X', Xwin[1][1]) && (Objects.equals('X', Xwin[2][1])))) {
            return true;
        }

        if (Objects.equals('X', Xwin[0][2]) && (Objects.equals('X', Xwin[1][2]) && (Objects.equals('X', Xwin[2][2])))) {
            return true;
        }

        if (Objects.equals('O', Xwin[2][0]) && (Objects.equals('O', Xwin[1][1]) && (Objects.equals('O', Xwin[0][2])))) {
            return true;
        }
        return false;
    }

    public static boolean SpotChecker(int P1, int P2, char Spot[][]) {
        if (Spot[P1][P2] != 'X')
            return false;
        else return true;
    }
}
