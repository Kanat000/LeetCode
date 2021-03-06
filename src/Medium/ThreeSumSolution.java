package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumSolution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solutionArr = new ArrayList<>(2);
       Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;
            while (j<k){
                System.out.println(i+" "+j+" "+k);
                int sum = nums[i]+nums[j]+nums[k];
                System.out.println(sum);
                if(sum == 0){
                    List<Integer> answerArr = Arrays.asList(nums[i],nums[j],nums[k]);
                    Collections.sort(answerArr);
                    if (!solutionArr.contains(answerArr))
                        solutionArr.add(answerArr);
                    k--;
                    j++;

                }
                else if (sum < 0)
                    j++;
                else k--;
            }
        }
        return solutionArr;


       //My first-try
       /* List<List<Integer>> solutionArr = new ArrayList<>(2);
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for (int k=j+1;k<nums.length;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum == 0){
                        List<Integer> arr = new ArrayList<>(2);
                        arr.add(nums[i]);arr.add(nums[j]);arr.add(nums[k]);
                        Collections.sort(arr);
                        if(!solutionArr.contains(arr))
                            solutionArr.add(arr);
                    }
                }
            }
        }
        return solutionArr;*/
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{3,0,-2,-1,1,2};//3 2 1 0 -1 -2
        System.out.println(threeSum(testArr));
    }
}
