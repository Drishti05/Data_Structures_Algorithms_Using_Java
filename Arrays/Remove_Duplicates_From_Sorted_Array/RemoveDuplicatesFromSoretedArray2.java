import java.util.Scanner;
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int size=nums.length;
        int j=0;
        if(size==0 || size==1) return size;
        for(int i=0;i<size-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j++]=nums[i];
            }
        }
        nums[j++]=nums[size-1];
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

