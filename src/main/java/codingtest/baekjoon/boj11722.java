package codingtest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class boj11722 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] arr = new int[N];
        int[] dp = new int[N];
        Arrays.fill(dp,1);
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] =1;
        for(int i=1;i<N;i++){
            for(int j=0;j<i;j++){
                if(arr[i]<arr[j] && dp[i]<=dp[j])dp[i]=dp[j] +1;
                else if(arr[i]==arr[j])dp[i] = dp[j];
            }
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
