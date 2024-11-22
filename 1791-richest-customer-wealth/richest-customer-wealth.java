class Solution {
    public int maximumWealth(final int[]... accounts) {
        int bigNumber = 0;
        for (final int[] account : accounts) {
            int currentNumber = 0;
            for(int value : account) {
                currentNumber += value;
            }

            if (currentNumber > bigNumber) {
                bigNumber = currentNumber;
            }
        }

        return bigNumber;

    }
}