//https://codeforces.com/problemset/problem/33/A
import java.util.*;
public class Dinner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] hash=new int[m+1];
        Arrays.fill(hash,Integer.MAX_VALUE);
        for(int i=0;i<n;i++){
            int row=sc.nextInt();
            int cap=sc.nextInt();
            hash[row]=Math.min(hash[row],cap);
        }
        int ans=0;
        for(int i:hash){
            ans+=(i==Integer.MAX_VALUE?0:i);
        }
        if(ans<=k){
            System.out.println(ans);
        }else{
            System.out.println(k);
        }
    }
}
