package flower.store;

// import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter 
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }

    public void setQuantity(int new_quantity) {
        this.quantity = new_quantity < 1 ? quantity: 1;
    }
    public double getPrice() {
        return flower.getPrice() * quantity;
    }

}
