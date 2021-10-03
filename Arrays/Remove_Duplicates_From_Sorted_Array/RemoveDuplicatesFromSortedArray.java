import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        Iterator<Integer> itr= set.iterator();
        int j=0;
        while(itr.hasNext()){
            nums[j]=itr.next();
            j++;
        }
        return j;
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Scanner sc1=new Scanner(System.in);
        int[] nums=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter the element");
            nums[i]=sc1.nextInt();
        }
        int answer=removeDuplicates(nums);
        System.out.println("The answer is:"+answer);
        
    }
    
}

