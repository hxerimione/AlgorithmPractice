package codingtest.leetcode.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum1(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }
    public int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }

        return new int[]{};
    }
}
