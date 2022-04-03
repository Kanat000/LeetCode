package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumClosestSolution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[nums.length-1];
        int minDiff = Math.abs(closestSum-target);

        if(nums.length == 3){
            closestSum = nums[0]+nums[1]+nums[nums.length-1];
        }else{
            for(int i=0;i<nums.length-2;i++){
                int j = i+1;
                int k = nums.length-1;
                while(j<k){
                    int sum = nums[i]+nums[j]+nums[k];
                    int diff = Math.abs(sum-target);
                    if(diff<=minDiff){
                        minDiff = diff;
                        closestSum = sum;
                    }
                    if(sum>target){
                        j++;
                    }else if(sum<target){
                        k--;
                    }else {
                        break;
                    }
                }
            }
        }
        return closestSum;

    }

    }
}
