/*Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:
Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res  = new ArrayList<>();
        rec(nums,0,curr,res);
        return res;
    }
    
    public void rec(int[] arr,int i,List<Integer> curr, List<List<Integer>> res){
        if(i == arr.length){
            res.add(new ArrayList<Integer>(curr));
            return;
        }
        curr.add(arr[i]);
        rec(arr,i+1, curr,res);
        curr.remove(curr.size()-1);
        rec(arr,i+1, curr,res);
    }
}