class Solution {
    public int longestSubsequence(String s, int k) {
        int cnt =0; long val=0; double pow=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='0') cnt++;
            else{
                pow = Math.pow(2,(s.length()-1)-i);
                if(val+pow<=k) {
                    cnt++;
                    val+=pow;
                }
            }
        }
        return cnt;
    }
}