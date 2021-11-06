/**
* Homework 2_corrected.
*
* @author Alex Murachev
*
* @version 06.11.2021
*/

class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(sum10_20(6, 7));
        System.out.println(sum10_20(1, 7));
        System.out.println(sum10_20(3, 7));
        whatnumber(1);
        whatnumber(-2);
        whatnumber(0);
        System.out.println(trueOrFalse(-1));
        System.out.println(trueOrFalse(8));
        System.out.println(trueOrFalse(0));
        printWordNTimes("Home",5);
        printWordNTimes("Winter",4);
        System.out.println(leapYear(2021));
        System.out.println(leapYear(2020));
        System.out.println(leapYear(2028));
    }
    
    // Задание №1.
    static boolean sum10_20(int x1, int x2) {
        return x1 + x2 >= 10 && x1 + x2 <= 20;           
    }
        
    // Задание №2.
    static void whatnumber(int a) {   
        if (a >= 0) {
            System.out.println("positive number");
        }
        else {
            System.out.println("negative number");
        }
    }
    
    // Задание №3.    
    static boolean trueOrFalse(int b) {
        return b < 0;             
    }
    
    // Задание №4.
    static void printWordNTimes(String word, int times) {
        for (int a = 0; a <= times; a++ ) {
            System.out.println(word + "");
        }
    }
    
    // Задание №5.
    static boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}