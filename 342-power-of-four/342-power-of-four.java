class Solution {
    public boolean isPowerOfFour(int n) {
        double x=Math.log(n)/Math.log(4);
        //System.out.println(x);
        if(x%1==0)
            return true;
        return false;
    }
}