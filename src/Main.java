import package1.Flower;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower("Rose",3,200);
        Flower flower2 = new Flower("Lily",5,500);
        Flower flower3 = new Flower("Tulpan",10,150);
        Flower flower4 = new Flower("Siren",6,100);
        Flower flower5 = new Flower("Baichechekey",1,900);

        Flower [] flowers = {flower1,flower2,flower3,flower4,flower5};

        Flower maxPriceFlower = maxPrice(flowers);
        System.out.println("Max price flower: " + maxPriceFlower);

        newFlower(flowers);
        System.out.println("\nNew sort flowers: ");
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
    }
    public static Flower maxPrice(Flower[] flowers){
        Flower max = flowers[0];
        for (Flower flower : flowers) {
            if(flower.getPrice() > max.getPrice()){
                max = flower;
            }
        }
        return max;
    }
    public static void newFlower(Flower[] flowers){
        for (int i = 0; i < flowers.length-1; i++) {
            for (int j = 0; j < flowers.length - i - 1; j++) {
                if(flowers[j].getFreshness() < flowers[j+1].getFreshness()){
                    Flower som = flowers[j];
                    flowers[j] = flowers[j+1];
                    flowers[j+1] = som;
                }
            }
        }
    }
}