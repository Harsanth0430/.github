// Last updated: 09/02/2026, 13:57:42
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m=nums1.length,n=nums2.length;
       int totallength=m+n;
       int m1=(totallength-1)/2;
       int m2=totallength/2;
       int i=0,j=0,count=0;
       int curr=0,prev=0;
       while(count<=m2)
{
    prev=curr;
    if(i<m&&(j>=n||nums1[i]<=nums2[j])){
        curr=nums1[i++];
    }else{
        curr=nums2[j++];
    }
    count++;
} if(totallength%2==0){
    return(prev+curr)/2.0;
} else{
    return curr;
}     }
    }