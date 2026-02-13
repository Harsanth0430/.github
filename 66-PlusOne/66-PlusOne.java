// Last updated: 13/02/2026, 10:09:15
class Solution {
    public int[] plusOne(int[] digits) {
        boolean Carry=false;
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            if(digits[i]<=9){
               return digits;
            }
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
return digits;
    }
}