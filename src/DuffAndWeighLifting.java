////https://codeforces.com/problemset/problem/587/a
//import java.util.*;
//
//public class DuffAndWeighLifting {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
//        int sum=0;
//        for(int i=0;i<n;i++){
//            int temp=sc.nextInt();
//            minHeap.offer(temp);
//            sum+=(int)Math.pow(2,temp);
//        }
//        if (sum > 0 && (sum & (sum - 1)) == 0) {
//            System.out.println(1);
////            System.exit(0);
//            return;
//        }
//
////        int curr=minHeap.poll();
//        while(!minHeap.isEmpty()){
//            int curr= minHeap.poll();
//
//        if(curr==minHeap.peek()){
//            curr+=1;
//            minHeap.offer(curr);
//        }else{
//            break;
//        }
//        }
//        System.out.println(minHeap.size()+1);
//    }
//}


import java.util.*;

public class DuffAndWeighLifting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] freq = new int[31];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            freq[x]++;
        }

        // Combine equal weights
        for (int i = 0; i < 30; i++) {

            freq[i + 1] += freq[i] / 2;

            freq[i] %= 2;
        }
        int answer = 0;

        for (int i = 0; i < 31; i++) {
            answer += freq[i];
        }

        System.out.println(answer);
    }
}