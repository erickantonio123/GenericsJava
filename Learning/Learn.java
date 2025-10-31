package Learning;

import java.util.ArrayList;
import java.util.List;

public class Learn {
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }   

     public void mostraritens(){
        System.out.println("Itens disponiveis" + items);
     }

     public void firstItem(){
        if(items.isEmpty()){
            throw new IllegalStateException("A lista está vazia");
        }
        System.out.println("primeiro item" + items.get(0));
        
        for(int i=0; i<items.size(); i++){
            System.out.println("Item " + (i+1) + ": " + items.get(i));
        }
     }
}
