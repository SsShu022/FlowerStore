package flower.store;

import java.util.List;

import flower.filters.SearchFilter;

public class Store {
    private List<Item> items;

    public List<Item> search(SearchFilter filter){
        List<Item> founfItems = items;
        for (Item item: items){
            founfItems.add(item);
        }
        return founfItems;
    }
    
}
