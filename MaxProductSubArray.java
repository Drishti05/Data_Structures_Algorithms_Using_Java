public class MaxProductSubArray {
    public static int maxProduct(int[] nums) {
        int local_maxima=nums[0];
        int local_minima=nums[0];
        int global_maxima=nums[0];
        for(int index=1;index<nums.length;index++){
            int temp_max=local_maxima;
 local_maxima=Math.max(nums[index],Math.max(local_maxima*nums[index],local_minima*nums[index]));
 local_minima=Math.min(nums[index],Math.min(local_minima*nums[index],temp_max*nums[index]));
            if(local_maxima>global_maxima) global_maxima=local_maxima;
        } 
        return global_maxima;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{-1,-2,-3,-4}));
    }
    
}
