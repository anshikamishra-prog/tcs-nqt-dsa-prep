package Strings;
public class CheckAnagram {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, they can't be anagrams
        if (s.length() != t.length()) return false;

        // Frequency array for 26 lowercase English letters
        int[] count = new int[26];

        // Count characters in s and subtract for t
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // If all counts are zero, it's an anagram
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }

    // Quick test
    public static void main(String[] args) {
        CheckAnagram sol = new CheckAnagram();
        System.out.println(sol.isAnagram("anagram", "nagaram")); // true
        System.out.println(sol.isAnagram("rat", "car"));         // false
    }
}

