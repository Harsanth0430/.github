// Last updated: 09/02/2026, 13:56:56
class Solution {
    public int thirdMax(int[] nums) {
    Arrays.sort(nums);
    List<Integer>list=new ArrayList<>();
    list.add(nums[0]);
    for(int i=1;i<nums.length;i++){
        if(nums[i-1]!=nums[i]){
            list.add(nums[i]);
        }
    }
    int listSize=list.size();
    if(listSize<3){
        return list.get(listSize-1);
    }      
    return list.get(listSize-3);
     }   
    }
