/**
* Homework 7.
*
* @author Alex Murachev
*
* @version 23.11.2021
*/

class Homework7 {
    
    private static int TIME = 0;
    
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Barsik", 150, 3);
        cat[1] = new Cat("Vasilisa", 100, 2);
        cat[2] = new Cat("Black", 80, 1);
        Plate plate = new Plate(500);

        for (int i = 0; i < 3; i++) {            
            System.out.print(cat[i].getName()  + " is hungry in " + cat[i].getSatietyTime() + " hour. ");
        }
        System.out.println("                                    ");
        System.out.println(plate);
        System.out.println("                                    ");
                
        do {
            for (Cat cats : cat) {                
                if (cats.getSatiety() == 0) {
                    if (!plate.checkFood(cats.getAppetite())) {
                        plate.increaseFood();
                    }
                    cats.eat(plate);
                    System.out.println(cats);
                }
                cats.setSatiety(cats.getSatiety() - 1);
            }
            System.out.println(TIME + " hour.");
            System.out.println(plate);
            System.out.println("                                    ");
            TIME++;

        } while (TIME <= 4);
    } 
}

class Cat {
    private String name;
    private int appetite;
    private int satietyTime;
    private int satiety;
    
    Cat(String name, int appetite, int satietyTime) {
        this.name = name;
        this.appetite = appetite;
        this.satietyTime = satietyTime;
        this.satiety = 0;
    }
    
    String getName() {
        return name;
    }

    int getAppetite() {
        return appetite;
    }

    int getSatietyTime() {
        return satietyTime;
    }

    int getSatiety() {
        return satiety;
    }

    void setSatiety(int satiety) {
        this.satiety = satiety;
    }
    
    void eat(Plate plate) { 
        plate.decreaseFood(appetite);
        satiety += satietyTime;
    }
    
    @Override
    public String toString() {
        return "Cat " + name + " eats " + appetite + " grams of feed.";
    }
}

class Plate {
    private int food;

    
    Plate(int food) {
        this.food = food;
    }
    
    int getFood() {
        return food;
    }
    
    void decreaseFood(int f) {
        this.food -= f;
    }
   
    void increaseFood() {
        this.food += 510;
        System.out.println("ATTENTION: 510 grams of feed was added to the bowl.");
        System.out.println("                                    ");
    }
    
    boolean checkFood(int f) {
        return (food - f) >= 0;
    }
    
    @Override
    public String toString() {
        return "Now in the bowl: " + food + " grams.";   
   }  
}