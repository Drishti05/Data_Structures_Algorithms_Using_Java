public class LargestNumber1{
    public static String largestNumber(int nums[]){
        String largestNumber=new String();
        for(int index=0;index<nums.length;index++){
            for(int iterator=index;iterator<nums.length;iterator++){
                String obj1= Integer.toString(nums[index]);
                String obj2= Integer.toString(nums[iterator]);
                String merge1=obj1+obj2;
                String merge2=obj2+obj1;
                long num1=Long.parseLong(merge1);
                long num2=Long.parseLong(merge2);
                if(num1<num2){
                    int temporary=nums[index];
                    nums[index]=nums[iterator];
                    nums[iterator]=temporary;
                }
            }
        }
        if(nums[0]==0) return largestNumber="0"; /*for the input array consisting of zeroes the expected output is "0" not "000000" */
        for(int index=0;index<nums.length;index++){
            largestNumber=largestNumber+Integer.toString(nums[index]);
        }
        return largestNumber;
    }
    public static void main(String[]args){
        String number=largestNumber(new int[] {23,56,7,9,0});
        System.out.println(number);
    }
}
