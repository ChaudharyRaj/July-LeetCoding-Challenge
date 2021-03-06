/*Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(n < 3) return new ArrayList<List<Integer>>();
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        for(int i = 0; i<n-2; ++i){
            if(i==0 || nums[i] != nums[i-1]){
                int j = i+1, k = n-1;
                while(j < k){
                    int sum  = nums[i] + nums[j] + nums[k];
                    if(sum == 0){
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while(j < k && nums[j] == nums[j+1]) j++;
                        while(j < k && nums[k] == nums[k-1]) k--;
                        j++; k--;
                    }
                    else if(sum > 0) k--;
                    else j++;
                }
            }
        }
        return result;
    }
}