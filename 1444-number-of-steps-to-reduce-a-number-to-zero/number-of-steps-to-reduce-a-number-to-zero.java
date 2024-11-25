class Solution {
    public int numberOfSteps(int num) {
        int verify = num;
        int steps = 0;

        while(verify != 0) {
            if(verify % 2 == 0) {
                verify /= 2;
            } else {
                verify -= 1;
            }
            steps += 1;
        }

        return steps;
    }
}