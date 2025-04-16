class Solution {
     public int climbStairs(int n){

         HashMap<Integer, Integer> memo = new HashMap<>();
         return dp(n, memo);
     }

     public int dp(int n, HashMap<Integer, Integer> memo){
        if(n <= 2){
             return n;
         }
         if(memo.containsKey(n)){
             return memo.get(n);
         }


         int result = dp(n - 1, memo) + dp(n - 2, memo);
         memo.put(n, result);
         return result;
     }
}