import java.util.List;

public class calculationservice {

    public static Integer max(List<Integer> list){
        if(list.isEmpty()){
            throw new IllegalArgumentException("List is empty");
        }
        Integer max = list.get(0);
        for(Integer item : list){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
    

}
