import java.util.Comparator;
import java.util.Arrays;
public class LargestNumber2 implements Comparator<String>{
    @Override
    public int compare(String obj1,String obj2){
        String order1=obj1+obj2;
        String order2=obj2+obj1;
        return order2.compareTo(order1); 
    }
    public static String largestNumber(int nums[]){
        String largestNumber="";
        String[] arrayOfStringValues=new String[nums.length]; 
        for(int index=0;index<nums.length;index++){
            arrayOfStringValues[index]=String.valueOf(nums[index]);}
            Arrays.sort(arrayOfStringValues,new LargestNumber2());
            if(arrayOfStringValues[0].equals("0")) return "0";
            for(String str : arrayOfStringValues){
                largestNumber=largestNumber+str;
              }
            return largestNumber;
            }
       
        
    public static void main(String[]args){
        String number=largestNumber(new int[] {23,56,7,9,0});
        System.out.println(number);
    }
}