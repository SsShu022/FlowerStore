package flower.store;

import java.util.concurrent.Flow;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @AllArgsConstructor @ToString
public class Flower {
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

// @Setter
// public class Flower {
//     @Getter
//     private double sepalLength;
//     private FlowerColor color;
//     @Getter
//     private double price;
//     @Getter
//     private FlowerType flowerType;

//     public String getColor() {
//         return color.toString();
//     }
// }
