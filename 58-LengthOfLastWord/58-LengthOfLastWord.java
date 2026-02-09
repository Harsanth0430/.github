// Last updated: 09/02/2026, 13:57:22
class Solution {
    public int lengthOfLastWord(String s) {
         String arr[]=s.split(" ");
         String k=arr[arr.length-1];
         int count=k.length();
         return count;

    }
}