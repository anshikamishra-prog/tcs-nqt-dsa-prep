package Array;
import java.util.Arrays;
public class ReverseArray{
    
    public static void reverse(int arr[]) {

        int first = 0;
        int last = arr.length-1;

        while(first<last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}