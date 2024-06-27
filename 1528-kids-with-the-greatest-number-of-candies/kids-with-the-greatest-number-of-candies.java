class Solution {
      public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> arrayReturn = new ArrayList<Boolean>();
        int candiesLength = candies.length;
        int maxValue = findMax(candies);
        System.out.println(maxValue);
        for (int i = 0; i < candiesLength; i++) {
            int sumValue = candies[i] + extraCandies;
            if (sumValue >= maxValue) {
                arrayReturn.add(true);
            } else {
                arrayReturn.add(false);
            }
        }

        return arrayReturn;
    }

    private int findMax(int[] candies) {
        int maxValue = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxValue) {
                maxValue = candies[i];
            }
        }

        return maxValue;

    }
}