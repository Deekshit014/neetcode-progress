class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(ch=='a' || ch=='b' || ch=='l' || ch=='o' || ch=='n')
                freq[ch-'a']++;
        }

        int b = freq['b'-'a'];
        int a = freq['a'-'a'];
        int l = freq['l'-'a']/2;
        int o = freq['o'-'a']/2;
        int n = freq['n'-'a'];

        int c=Integer.MAX_VALUE;
        c = Math.min(b, c);
        c = Math.min(a, c);
        c = Math.min(l, c);
        c = Math.min(o, c);
        c = Math.min(n, c);
        return c;
    }
}