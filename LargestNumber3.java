import java.util.Arrays;
public class LargestNumber3 {
    public static String largestNumber(int nums[]){
        int length=nums.length;
        String[] arrayOfStringValues=new String[length];
        for(int index=0;index<length;index++){
            arrayOfStringValues[index]=String.valueOf(nums[index]);
        }
        Arrays.sort(arrayOfStringValues,(a,b)->(b+a).compareTo(a+b));
        StringBuilder sb=new StringBuilder();
        for(String str:arrayOfStringValues){
            sb.append(str);
        }
        String result=sb.toString();
        return result.startsWith("0")? "0" :result;

    }
    public static void main(String[] args) {
        String number = largestNumber(new int[]{23,56,7,9,0});
        System.out.println(number);
    }
}
