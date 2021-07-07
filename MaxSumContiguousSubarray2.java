public class MaxSumContiguousSubarray2 {
    public static int maxSubArray(int numbers[]){
        int global_maxima=numbers[0];
        int local_maxima=0;
        for(int index=0;index<numbers.length;index++){
            local_maxima=Math.max(local_maxima+numbers[index],numbers[index]);
            if(local_maxima>global_maxima) global_maxima=local_maxima;
        }
        return global_maxima;

    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {872,74,-9873,-567}));
    }
    
}
