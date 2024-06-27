class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxValue = findMax(candies);
        List<Boolean> arrayReturn = new ArrayList<>(candies.length);

        for (int candy : candies) {
            arrayReturn.add(candy + extraCandies >= maxValue);
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