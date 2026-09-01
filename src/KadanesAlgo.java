import java.util.*;

public class KadanesAlgo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();

        int sum=0;
        int max_sum_till_now=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            sum+=arr[i];
            max_sum_till_now=Math.max(max_sum_till_now,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max_sum_till_now);
    }
}
