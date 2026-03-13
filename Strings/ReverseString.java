package Strings;
public class ReverseString{

    public static void reverse(char[] s) {
        
        int start = 0;
        int end = s.length - 1;

        while(start<end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        char s[] = {'a' , 'b' , 'c' , 'd' , 'e'};
        reverse(s);
        System.out.println(s);
    }
} 
    

