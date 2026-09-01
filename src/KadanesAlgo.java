import java.util.*;

public class KadanesAlgo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int start=0;
        int i_start=0;
        int j_start=0;
        int sum=0;
        int max_sum_till_now=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(max_sum_till_now<sum){
                max_sum_till_now=sum;
                i_start=start;
                j_start=i;
            }
//            max_sum_till_now=Math.max(max_sum_till_now,sum);
            if(sum<0){
                sum=0;
                start=i+1;
            }
        }
        System.out.println(max_sum_till_now);
        for(int i=i_start;i<=j_start;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
