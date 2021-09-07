import java.util.*;

class ConsecutiveOnes{
    public static boolean solve(int[] nums) {
        boolean flag=false;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(!flag) count++;
                flag=true;}
            else{
                flag=false;
            }    

        }
        return (count==1);
        
    }

    public static void main(String[] args) {
        System.out.println("Enter the size Of array");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums=new int[size];
        for(int index=0;index<size;index++){
            System.out.println("Enter the element in the array");
            Scanner sc1 =new Scanner(System.in);
            nums[index]= sc1.nextInt();
        }
        boolean ans= solve(nums);
        System.out.println(ans);




    }
}