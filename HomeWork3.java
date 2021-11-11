/**
* Homework 3.
*
* @author Alex Murachev
*
* @version 11.11.2021
*/

import java.util.Arrays;

class HomeWork3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal(6);
        twoArgumentsForArr(7, 10);
    }
    
    // Задание №1.
    static void invertArray() {
        int[] arr = {1, 0, 0, 0, 1 , 1 , 1};
        System.out.println(Arrays.toString(arr));   
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] == 0 ? 1 : 0;
                System.out.print(arr[i] + ",");
            }
            System.out.println();  
    }
    
    // Задание №2.
    static void fillArray() {
        int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
                System.out.print(arr[i] + " ");
            }
            System.out.println();  
    }
    
    // Задание №3.
    static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)                     
                System.out.print((arr[i] *= 2) + " ");
            }
        System.out.println();    
    }

    // Задание №4.
     static void fillDiagonal(int a) {
        int[][] arr = new int[a][a];
            for (int i = 0; i < a; i++) {
                arr[i][i] = 1;
                arr[i][a - i - 1] = 1;
            }
            for (int i = 0; i < a; i++)
            System.out.println(Arrays.toString(arr[i]));
            System.out.println();
    }

    // Задание №5.
    static int[] twoArgumentsForArr (int len, int initialValue){
        int arr[] = new int[len];
            for (int i = 0; i < arr.length; i++){
                arr[i] = initialValue;
                System.out.print(arr[i] + " ");
        }
        return arr;
    }
}