package flower.store;


import org.junit.jupiter.api.Test;

import flower.filters.SearchFilter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;


public class StoreTest {

    @Test
    public void testSearchPrice() {
        Store store = new Store();
        ArrayList items = new ArrayList<Item>();
        items.add(new Flower(FlowerType.CHAMOMILE, 3, 10, FlowerColor.RED));
        items.add(new Flower(FlowerType.ROSE, 3, 5, FlowerColor.RED));
        items.add(new Flower(FlowerType.ROSE, 3, 10, FlowerColor.WHITE));
        store.setItems(items);
        SearchFilter filter = new SearchFilter() {
            @Override
            public boolean match(Item item) {
                return item.getPrice() < 6.0;
            }
    };

        List<Item> filteredItems = store.search(filter);
        assertEquals(1, filteredItems.size());
    }
}