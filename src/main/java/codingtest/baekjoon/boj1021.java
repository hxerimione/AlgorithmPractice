package codingtest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class boj1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer =0;

        for(int i=0;i<N;i++){
            List<String> list = new ArrayList<>();
            String str = br.readLine();
            String[] arr = str.split("");
            for (int j=0;j<str.length();j++){
                if (!list.contains(arr[j])){
                    list.add(arr[j]);
                }else if (list.get(list.size()-1).equals(arr[j])){
                    continue;
                }else{
                    answer+=1;
                    break;
                }
            }

        }
        System.out.println(N-answer);
    }
}
