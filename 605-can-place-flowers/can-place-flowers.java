class Solution {
 public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int quantitySpace = 0;
        if (n == 0) {
            return true;
        }

        
        for (int i = 0; i < flowerbed.length; i++) {
            System.out.println("index  " + i);
            if (flowerbed[i] == 0) {
                boolean havePrev = (i == 0 || flowerbed[i - 1] == 0);
                boolean haveNext = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                if (havePrev && haveNext) {
                    flowerbed[i] = 1;
                    quantitySpace++;
                    System.out.println(quantitySpace + "  space");
                    if (quantitySpace >= n) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}