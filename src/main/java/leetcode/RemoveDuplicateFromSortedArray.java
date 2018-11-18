package leetcode;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int count = removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int count = 0;
        for(int i =1;i <nums.length;i++){
            if(nums[count] != nums[i]){
                count = count +1;
                nums[count] = nums[i];
            }
        }
       /* for(int i =0;i <nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println(count+1);*/
        return count+1;

    }
}
