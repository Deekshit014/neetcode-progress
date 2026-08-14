class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        String ans = new String(arr);
        String ans1 = new String(arr1);
        if(ans.equals(ans1))
            return true;
        return false;
    }
}
