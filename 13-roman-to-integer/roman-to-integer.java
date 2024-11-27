class Solution {
      public int romanToInt(String s) {
          final Map<Character, Integer> translate = new HashMap<>();
        translate.put('I', 1);
        translate.put('V', 5);
        translate.put('X', 10);
        translate.put('L', 50);
        translate.put('C', 100);
        translate.put('D', 500);
        translate.put('M', 1000);

        int finalValue = 0;
        final int length = s.length();

        for(int i = 0; i < length; i++) {
            final int currentValue = translate.get(s.charAt(i));

            if(i + 1 < length && currentValue < translate.get(s.charAt(i + 1))) {
                finalValue -= currentValue;
            } else {
                finalValue += currentValue;
            }

        }

        return finalValue;
    }
}