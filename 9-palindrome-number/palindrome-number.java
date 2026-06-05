class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x == 0) {
            return true;
        } else {
            String s = x+"";
            String p = "";
            for (int i = 0; i < s.length(); i++) {
                p = s.charAt(i) +p;

            }
            if(s.equals(p)){
                return true;
            }
            else {
                return false;
            }

        }
    }
}
