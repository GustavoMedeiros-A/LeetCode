    class Solution {
        public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        int pointerS = 0, pointerT = 0;
        while (pointerT < t.length()) {

            if (pointerS < s.length() && t.charAt(pointerT) == s.charAt(pointerS)) {
                pointerS++;
                if (pointerS == s.length()) {
                    return true;
                }
            }

            pointerT++;
        }

        return false;
        }

    }