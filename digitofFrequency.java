import java.util.Scanner;
//1. You are given a number n.
  //      2. You are given a digit d.
    //    3. You are required to calculate the frequency of digit d in number n.
public class digitofFrequency {
    public  static  void main (String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int d=scn.nextInt();
        int ans=digit(n,d);
        System.out.println(ans);
    }
    static int digit(int n ,int d){
        int cnt=0;
        while (n>0){
            int r=n%10;
            if(r==d){
                cnt++;
            }
            n=n/10;
        }


        return cnt;
    }
}
