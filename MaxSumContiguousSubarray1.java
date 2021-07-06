public class MaxSumContiguousSubarray1 {
    static int MaxSum(int [] numbers){
        int sum = numbers[0];
        int total;
        for(int i=0;i<numbers.length;i++){
            total=0;
            for(int j=i;j<numbers.length;j++){
                total=total+numbers[j];
                if(total>sum) sum=total;
            }
        } 
        return sum;
    }
    public static void main(String[] args) {
        int result=MaxSum(new int[] {1,2,3,4,-10});
        System.out.println(result);
    
    }
    
}
