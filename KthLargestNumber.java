package lintcode;

public class KthLargestNumber {
	/*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
	public static void main(String[] args){
		int nums[]={4,5,2,4,7,8,9};
		kthLargestElement(3,nums);
	}
	public static int kthLargestElement(int k, int[] nums) {
        // write your code here
		if(k>nums.length) return 0;
		return helper(nums.length-k+1,nums,0,nums.length-1);
    }
	public static int helper(int k, int[] nums, int start, int end){
		int left = start, right = end;
		int pivot = end;
		while(true){
			while(nums[left]<nums[end] && left < right){
				left ++;
			}
			while(nums[right]>=nums[pivot] && left < right){
				right --;
			}
			if(left == right) break;
			swap(nums,left,right);			
		}
		swap(nums,left,end);
		if(left + 1 == k) return nums[left];
		else if(left + 1 <k) return helper(k,nums,left+1,end);
		else return helper(k, nums,start,left-1);
	}
	public static void swap(int[] nums,int left,int right){
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
	}
}
