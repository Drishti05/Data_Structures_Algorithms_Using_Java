// This will prevent integer overflow
import java.util.*;
public class MissingNumberBest {
    public static int missingNumber(int[] nums) {
        int actualXOR=0;
        int size=nums.length;
        int idealXOR=0;
        for(int index=0;index<size;index++){
            actualXOR^=nums[index];
            idealXOR^=index;
        }
        idealXOR^=size;
        return actualXOR^idealXOR;
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        int[] arr=new int[size];
        for(int index=0;index<size;index++){
            System.out.println("Enter the element");
            arr[index]=sc1.nextInt();
        }
        System.out.println("The Missing number is:"+missingNumber(arr));


        
    }
    
}
