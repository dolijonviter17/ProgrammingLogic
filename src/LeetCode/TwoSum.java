package LeetCode;

public class TwoSum {

    public int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                int complement = target - nums[i];

                if (nums[j] == complement){
                    return new int[] {i,j};
                }
            }
        }
        throw new RuntimeException("no math found");
    }
}
