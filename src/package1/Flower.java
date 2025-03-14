package package1;

import java.time.LocalDate;

public class Flower {
    private String flowerName;
    private int freshness;
    private int price;

    public Flower(String flowerName, int freshness, int price) {
        this.flowerName = flowerName;
        this.freshness = freshness;
        this.price = price;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public int getFreshness() {
        return freshness;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return
                "Name: " + flowerName +
                "  Freshness: " + freshness +
                "  Price: " + price;

    }
}
