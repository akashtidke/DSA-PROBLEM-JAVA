import java.util.Scanner;
public class decimalToAnyBase {
    public  static  void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int b=scn.nextInt();
        int ans=dtab(n,b);
        System.out.println(ans);
    }
    static  int dtab(int n,int b){
        int num=0;
        int power=0;
        while(n>0){
            int r=n%b;
             n=n/b;
             num+=(int)r*Math.pow(10,power);
             power++;
        }

        return num;
    }
}
