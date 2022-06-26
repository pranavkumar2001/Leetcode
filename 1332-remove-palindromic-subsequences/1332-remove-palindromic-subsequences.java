class Solution {
  public int removePalindromeSub(String s) {
    return isPalindrome(s) ? 1 : 2;   // Using ternary Operator to return our answer
  }
// To check whether s  is a palindrome or not
  boolean isPalindrome(String s) {
    int l = 0, r = s.length() - 1;
    while (l < r) {
      if (s.charAt(l) != s.charAt(r)) {
        return false;
      }
      l++;
      r--;
    }
    return true;
  }
}