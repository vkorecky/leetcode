import java.util.HashMap;

// LeetCode challenge URL: https://leetcode.com/problems/roman-to-integer/
class RomanToInteger {
    HashMap<Character, Integer> numbers = new HashMap<>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        Integer result = 0;

        for (int pointer = s.length() - 1; pointer >= 0; pointer--) {
            Character romanNum = s.charAt(pointer);
            if ((pointer > 0) && (numbers.get(s.charAt(pointer)) > numbers.get(s.charAt(pointer - 1)))) {
                result += numbers.get(s.charAt(pointer)) - numbers.get(s.charAt(pointer - 1));
                pointer--;
            } else {
                result += numbers.get(s.charAt(pointer));
            }
        }

        return result;
    }
}