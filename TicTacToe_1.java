/**
* Homework 4.
*
* @author Alex Murachev
*
* @version 15.11.2021
*/

import java.util.Random;
import java.util.Scanner;

class TicTacToe_1 {
    final char SIGN_X = 'x';     // sign of human
    final char SIGN_O = 'o';     // sign of AI
    final char SIGN_EMPTY = '.'; // sign of empty cell
    char[][] table;
    Scanner sc;
    Random random;
    
    public static void main(String[] args) {
        new TicTacToe_1().game();
    }
    
    TicTacToe_1() {
        table = new char[3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }
    
    void game() {
        initTable();
        while (true) {
            turnHuman();
            if (checkWin(SIGN_X)) {
                System.out.println("YOU WON!");
                break;                
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW");
                break;                
            }
            turnAI();
            printTable();
            if (checkWin(SIGN_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW");
                break;                
            }
        }
        System.out.println("GAME OVER");
        printTable();
    }
    
    void initTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }
    }
    
    void printTable() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println(); 
        }
    }
    
    void turnHuman() {
        int x,y;
        do {
            System.out.print("Your turn x y [1..3]:");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!isCellValid(x,y));
        table[y][x] = SIGN_X;
    }
    
    void turnAI() {
        int x,y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        }
        while (!isCellValid(x,y));
        table[y][x] = SIGN_O;
    }
    
    boolean checkWin(char ch) {
        // Check lines
        boolean cols, rows;
        for (int col = 0; col < 3; col++) {
            cols = true;
            rows = true;
            for (int row = 0; row < 3; row++) {
                cols &= (table[col][row] == ch);
                rows &= (table[row][col] == ch);
            }
            if (cols || rows) return true;
        }
        //
        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        return false;
    }
    
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }
    
    boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (table[i][j] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}