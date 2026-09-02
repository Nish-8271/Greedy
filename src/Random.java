import java.util.*;

public class Random {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        int k=sc.nextInt();
        int[] hash=new int[26];
        for(char ch : str.toCharArray()){
            hash[ch-'a']++;
        }

    }
}
