// Time Complexity :  O(log(dividend))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes Its working
// Any problem you faced while coding this : No
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==0) return 0;
        if(divisor==1) return dividend;
        if(divisor ==-1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
        if(divisor ==1 && dividend == Integer.MIN_VALUE) return Integer.MIN_VALUE;
        
        long ldividend = Math.abs((long) dividend); //for overflow handling
        long ldivisor = Math.abs((long) divisor); // for overflow handling
        int result = 0;
        while(ldividend >= ldivisor)
        {
            int numShift =0;
            while(ldividend >= ldivisor<<numShift)
            {
                numShift++;
            }
            numShift-=1;
            result+= 1<< numShift; // double the numbers numSAhift times by left shift
            ldividend-=ldivisor<<numShift; // get the new dividend
        }
        if((dividend>0 && divisor >0) || (dividend<0 && divisor <0)) return result; //check for positive or negetaive
        else return -result;
    }
}