package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @AllArgsConstructor @ToString
public class Flower extends Item {

    private FlowerType flowerType;
    private double sepalLength;
    private double price;
    private FlowerColor color;

    public Flower() {

    }
    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.color = flower.color;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
    }
    
}
