/* We have an Array[] of N elements and a number K. ( 1 <= K <=N).Split the given array into K
 subarrays (they must cover all the elements). The maximum subarray sum achievable out of K
 subarrays formed must be the minimum possible. Find that possible subarray sum. */

public class classroom{
    public static int splitArray(int[] nums, int K) {
        int low = 0, high = 0;
        for (int i=0;i<nums.length;i++) {
            int num=nums[i];
            low = Math.max(low, num);
            high += num;
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = getCount(nums, mid);
            if (count > K) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
    private static int getCount(int[] nums, int target) {
        int count = 1;
        int sum = 0;
        for (int i=0;i<nums.length;i++) {
            int num=nums[i];
            sum += num;
            if (sum > target) {
                sum = num;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        System.out.println(splitArray(nums, 3)); 
    }
}
