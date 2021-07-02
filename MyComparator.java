import java.util.Comparator;
public class MyComparator implements Comparator<String>{
    @Override
    public int compare(String obj1,String obj2){
        String order1=obj1+obj2;
        String order2=obj2+obj1;
        return order2.compareTo(order1); 
    }
}
