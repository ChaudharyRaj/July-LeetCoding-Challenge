/*Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"*/

class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        String res ="";
        int a_length = a.length();
        int b_length = b.length();
        int i = 0;
        while(i<a_length || i <b_length || carry != 0){
            int x =0;
            if(i <a_length && a.charAt(a_length-1-i) == '1') x =1;
            int y =0;
            if(i <b_length && b.charAt(b_length-1-i) == '1') y =1;
            
            res = (x+y+carry)%2+res;
            carry =(x+y+carry)/2;
            i++;
        }
        return res;
    }
}