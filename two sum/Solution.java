import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        // write your code here
    }
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){ map.put(nums[i],i); }

        for(int i=0;i<nums.length;i++){
            int value=target-nums[i];
            if (map.containsKey(value) && map.get(value)!=i){
                result[0]=i;
                result[1]=map.get(value);
                break;
            }
        }

        return result;
    }
}