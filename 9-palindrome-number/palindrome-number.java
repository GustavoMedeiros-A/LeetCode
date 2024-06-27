class Solution {
    public boolean isPalindrome(int x) {
        // Number negative = false
        if (x < 0) {
            return false;
        }

        int inverted = inverterNumber(x);

        return x == inverted;

    }

    private int inverterNumber(int number) {
        int inverted = 0;
        while (number != 0) {
            int digit = number % 10;
            inverted = inverted * 10 + digit;
            number /= 10;
        }
        return inverted;

    }
}


