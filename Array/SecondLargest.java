package Array;
public class SecondLargest{

    public int findSecondLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        //edge case
        if(arr.length < 2) {
            return -1;
        }

        for(int i = 0 ; i<arr.length ; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] == largest) {
                secondLargest = arr[i];
            }
        }

        //edge case
        if(secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;
    }
    public static void main(String args[]) {
        int arr[] = {9,8,10,5,13,7};
        SecondLargest sl = new SecondLargest();
        System.out.println(sl.findSecondLargest(arr));
    }
}