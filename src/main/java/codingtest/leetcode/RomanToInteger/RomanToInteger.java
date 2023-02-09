package codingtest.leetcode.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt1(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int output=0;
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        output = map.get(s.charAt(s.length() - 1));

        for(int i = s.length() - 2; i >= 0; i--) {
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                output += map.get(s.charAt(i)).intValue();
            else
                output -= map.get(s.charAt(i)).intValue();
        }

        return output;
    }
    public int change(char c){
        if (c=='I')return 1;
        else if (c=='V') return 5;
        else if (c=='X') return 10;
        else if (c=='L') return 50;
        else if (c=='C') return 100;
        else if (c=='D') return 500;
        else return 1000;
    }
    public int romanToInt2(String s) {
        int output = 0;
        output = change(s.charAt(s.length()-1));

        for(int i = s.length() - 2; i >= 0; i--) {
            if(change(s.charAt(i)) >= change(s.charAt(i + 1)))
                output += change(s.charAt(i));
            else
                output -= change(s.charAt(i));
        }

        return output;
    }

}
