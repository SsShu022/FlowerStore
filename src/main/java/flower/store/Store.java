package flower.store;

import java.util.ArrayList;
import java.util.List;

import flower.filters.SearchFilter;
import lombok.Getter;
import lombok.Setter;
@Setter @Getter
public class Store {
    private List<Item> items;

    public List<Item> search(SearchFilter filter) {
        List<Item> founfItems = new ArrayList<>();
    
        for (Item item: items) {
            if (filter.match(item)) {
                founfItems.add(item);
            }
        }
        return founfItems;
    }
    
}
