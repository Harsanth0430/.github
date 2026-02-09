// Last updated: 09/02/2026, 13:57:14
class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(" "))
        return true;
        else
        s.trim();
        String a=s.replaceAll("[^a-zA-Z0-9]","");
        String b=a.toLowerCase();
        StringBuilder str=new StringBuilder(b);
        str.reverse();
        if(b.equals(str.toString()))
        return true;
        else
        return false;
    }
}