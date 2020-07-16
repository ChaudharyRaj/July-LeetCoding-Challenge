/*
Write a program to find the n-th ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 

Example:

Input: n = 10
Output: 12
Explanation: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
Note:  

1 is typically treated as an ugly number.
n does not exceed 1690.
*/

class Solution {
    public int nthUglyNumber(int n) {
        if(n==0) return 0;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(numbers.size()<n){
            int temp1 = numbers.get(i)*2;
            int temp2 = numbers.get(j)*3;
            int temp3 = numbers.get(k)*5;
            
            int minum = Math.min(temp1,Math.min(temp2,temp3));   
            numbers.add(minum);
                                 
            if(minum == temp1)
                i++;
            if(minum == temp2)
                j++;
            if(minum == temp3)
                k++;   
        }
        return numbers.get(numbers.size()-1);
    }
}