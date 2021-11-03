class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    // Задание №2.
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // Задание №3.
    static void checkSumSign() {
        int a = 10;
        int b = -23;
        int c = a + b;
        if (c >= 0) {
            System.out.println("The amount is positive");
        }
        else {
            System.out.println("The amount is negative");
        }
    }
    // Задание №4.
    static void printColor() {
        int value;
        value = -34;
        if (value <= 0) {
            System.out.println("Red");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("yellow");
        }
        else {
            System.out.println("green");
        }
    }
    // Задание №5.
    static void compareNumbers() {
        int a = 39;
        int b = -5;
        if (a >= b) {
            System.out.println("a >= b");            
        }
        else {
            System.out.println("a < b");
        }
    }
}    