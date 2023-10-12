package flower.store;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerPackTest {

    @Test
    public void testGetPrice() {
        Flower flower = new Flower(FlowerType.CHAMOMILE, 3, 10, FlowerColor.RED);
        FlowerPack flowerPack = new FlowerPack(flower, 5);

        double expectedPrice = 10.0 * 5;
        double actualPrice = flowerPack.getPrice();

        assertEquals(expectedPrice, actualPrice, 0.01);
    }

    @Test
    public void testSetQuantity() {
        Flower flower = new Flower(FlowerType.ROSE, 3, 7, FlowerColor.RED); 
        FlowerPack flowerPack = new FlowerPack(flower, 3);

        flowerPack.setQuantity(7);

        assertEquals(1, flowerPack.getQuantity());

        flowerPack.setQuantity(-5);

        assertEquals(1, flowerPack.getQuantity());
    }
}

