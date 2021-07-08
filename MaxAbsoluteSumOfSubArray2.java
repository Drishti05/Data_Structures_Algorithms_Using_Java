public class MaxAbsoluteSumOfSubArray2 {
    public static int maxAbsoluteSum(int numbers[]){
        int global_maxima;
        int local_maxima;
        int local_minima;
        int global_minima=local_minima=local_maxima=global_maxima=numbers[0];
        for(int index=1;index<numbers.length;index++){

            if(local_maxima>0) local_maxima+=numbers[index];
            else local_maxima=numbers[index];

            if(local_minima<0) local_minima+=numbers[index];
            else local_minima=numbers[index];

            global_maxima=Math.max(global_maxima,local_maxima);
            global_minima=Math.min(global_minima,local_minima);

        }
        return Math.max(Math.abs(global_maxima),Math.abs(global_minima));
    }

    public static void main(String[] args) {
        System.out.println(maxAbsoluteSum(new int[] {-2,-8,-7,0,9}));
    }
    
}
