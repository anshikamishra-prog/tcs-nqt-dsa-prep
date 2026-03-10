package Array;
public class ThirdMaximum{

    public int thirdMax(int nums[]) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        int count = 0;

        for(int i = 0 ; i<nums.length ; i++) {
            if(nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
                count++;
            }

            if(nums[i] > second && nums[i] != first) {
                second = first;
                second = nums[i];
                count++;
            }

            if(nums[i] > third && nums[i] != second && nums[i] != first) {
                third = nums[i];
                count++;
            }
        }

        if(count<3) {
            return (int)first;
        }

        return (int)third;

    }
    public static void main(String[] args) {
        int nums [] = {17,8,2,11,9,5};
        ThirdMaximum t = new ThirdMaximum();
        System.out.println(t.thirdMax(nums));
    }
}