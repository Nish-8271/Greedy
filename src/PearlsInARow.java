//https://codeforces.com/problemset/problem/620/C

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PearlsInARow {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(
          new InputStreamReader(System.in)
        );
        String size="";
        try {
             size= br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int n=Integer.parseInt(size);
        String arr="";
        try {
            arr= br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        List<Integer> ans=new ArrayList<>();
        String[] temp=arr.split(" ");
        for(String s:temp){
            ans.add(Integer.parseInt(s));
        }
        List<int[]> ans1=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        int best_i=1;
        for(int i=0;i<ans.size();i++){
            if(set.contains(ans.get(i))){
                ans1.add(new int[]{best_i,i+1});
                set.clear();
                best_i=i+2;
            }else{
                set.add(ans.get(i));
            }
        }
        int size2=ans1.size();
        if(size2==0){
            System.out.println(-1);
            return ;
        }
        ans1.get(size2-1)[1]=n;
        System.out.println(size2);
        for(int[] pair : ans1){
            System.out.println(pair[0]+" "+pair[1]);
        }
    }
}
