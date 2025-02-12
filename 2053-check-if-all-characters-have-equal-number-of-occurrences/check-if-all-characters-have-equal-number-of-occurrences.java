class Solution {
    public boolean areOccurrencesEqual(String s) {
                 int[] counts = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            counts[(int) s.charAt(i) - (int) 'a']++;
        }
        
        int expected = 0;
        for(int count : counts) {
            if(count > 0) {
                expected = count;
                break;
            }
        }
        
        for(int count : counts) {
            if(count > 0 && count != expected) {
                return false;
            }
        }
        
        return true;


    }
}