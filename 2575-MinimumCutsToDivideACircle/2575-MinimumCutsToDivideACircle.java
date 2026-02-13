// Last updated: 13/02/2026, 10:09:17
class Solution {
    public int numberOfCuts(int n) {
        if(n==1){
            return 0;
        }
        if(n%2==0){
            return n/2;
        }
        return n;
    }
}