package codingtest.programmers;

import java.io.*;
import java.util.*;


public class main {

    public class StackToQueue<T> {
        Stack<T> stack1 = new Stack<>();
        Stack<T> stack2 = new Stack<>();

        private void moveIfAbsent() {
            if (stack2.size() == 0)
                while (stack1.size() != 0) {
                    stack2.add(stack1.pop());
                }
        }
        public void add(T t) {
            stack1.add(t);
        }

        public T peek() {
            moveIfAbsent();
            return stack2.peek();
        }

        public T poll() {
            moveIfAbsent();
            return stack2.pop();
        }

        public int size() {
            return stack1.size() + stack2.size();

        }
    }
    public class QueueToStack<T>{
        LinkedList<T> mainQueue = new LinkedList<>();
        LinkedList<T> subQueue = new LinkedList<>();
        private void push(T t){
            if(mainQueue.isEmpty())
                mainQueue.add(t);
            else
                while (!mainQueue.isEmpty())
                    subQueue.add(mainQueue.poll());
                mainQueue.add(t);
                while (!subQueue.isEmpty())
                    mainQueue.add(subQueue.poll());
        }
        public T pop(){
            return mainQueue.poll();
        }
    }
    public class SelectSort{
        private void selection_sort(int[] a, int size) {

            for(int i=0;i<size-1;i++){
                int min_index = i;

                for(int j=i+1;j<size;j++){
                    if(a[j] <a[min_index]){
                        min_index = j;
                    }
                }
                swap(a,min_index,i);
            }

        }

        private void swap(int[] a, int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    public class HeapSort{
        public int getParent(int child){
            return (child-1)/2;
        }
        private void swap(int[] a, int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        private void heapify(int[] a, int parentIdx, int lastIdx) {
            int leftChildIdx = 2 * parentIdx + 1;
            int rightChildIdx = 2 * parentIdx + 2;
            int largestIdx = parentIdx;

            if(leftChildIdx < lastIdx && a[largestIdx] < a[leftChildIdx]) {
                largestIdx = leftChildIdx;
            }

            if(rightChildIdx < lastIdx && a[largestIdx] < a[rightChildIdx]) {
                largestIdx = rightChildIdx;
            }
            if(parentIdx != largestIdx) {
                swap(a, largestIdx, parentIdx);
                heapify(a, largestIdx, lastIdx);
            }
        }
    }
    public static void permutation(int[] arr, int[] out, boolean[] visited, int depth, int r){
        if(depth == r){
            for(int num: out) System.out.print(num);
            System.out.println();
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, out, visited, depth+1, r);
                visited[i] = false;
            }
        }
    }
    public static void permutation(int[] arr, int[] out, int depth, int r){
        if(depth == r){
            for(int num: out) System.out.print(num);
            System.out.println();
            return;
        }
        for(int i=0; i<arr.length; i++){
            out[depth] = arr[i];
            permutation(arr, out, depth+1, r);
        }
    }
    public static void combination(int[] arr, boolean[] visited, int start, int depth, int r){
        if(depth == r){
            for(int i=0; i<arr.length; i++){
                if(visited[i]) System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }
        for(int i=start; i<arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                combination(arr, visited, i+1, depth+1, r);
                visited[i] = false;
            }
        }
    }
    public static void combination(int[] arr, int[] out, int start, int depth, int r){
        if(depth == r){
            for(int num : out) System.out.print(num);
            System.out.println();
            return;
        }
        for(int i=start; i<arr.length; i++){
            out[depth] = arr[i];
            combination(arr, out, i, depth+1, r);
        }
    }


    public static void main(String[] args) throws IOException {
        bj17413();
    }
    public static void bj17413() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] arr = str.split(" ");

        String answer ="";
        for (String s :
                arr) {
            StringBuffer sb = new StringBuffer(s);
            String reverse = sb.reverse().toString();
            answer+=reverse+" ";
        }

        System.out.println(answer);
    }
    public static void bj1181() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i=0;i<n;i++){
            arr[i] = br.readLine();
        }

        Arrays.stream(arr).sorted(Comparator.comparing(String::length).thenComparing(String::compareTo)).distinct().forEach(System.out::println);

    }
    public static void bj1051() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String arr[][] = new String[N][M];
        for (int i=0;i<N;i++){
            String str = br.readLine();
            arr[i] = str.split("");
        }
        int k = Math.min(N,M);
        boolean flag = false;
        int answer=1;
        for(int t=k-1;t>0;t--) {
            for (int i = 0; i < N - t; i++) {
                for (int j = 0; j < M - t; j++) {
                    if(arr[i][j].equals(arr[i+t][j]) && arr[i][j].equals(arr[i][j+t]) && arr[i][j].equals(arr[i+t][j+t])){

                        flag = true;
                        answer = t+1;
                    }
                }
            }
            if (flag) break;
        }
        System.out.println(answer*answer);
    }
    public static void bj2738(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for (int i=0;i<2;i++){
            for (int j=0;j<N;j++){
                for (int k=0;k<M;k++){
                    arr[j][k]+=sc.nextInt();
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
