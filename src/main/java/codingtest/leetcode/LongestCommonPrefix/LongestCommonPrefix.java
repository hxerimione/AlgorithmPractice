package codingtest.leetcode.LongestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix1(String[] strs) {
        Arrays.sort(strs, (a, b)->Integer.compare(a.length(), b.length()));
        String answer ="";
        char c =' ';
        for (int i=0;i<strs[0].length();i++){
            for (int j=0;j<strs.length;j++){
                if (j==0) c = strs[j].charAt(i);
                else if (!(c==strs[j].charAt(i)))return answer;
            }
            answer += Character.toString(c);
        }
        return answer;
    }

    public static String longestCommonPrefix2(String[] strs) {
        String prefix = strs[0];
        for(int i =0; i<strs.length; i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.length()==0){return "";}
            }
        }
        return prefix;



    }

}
