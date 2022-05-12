import java.util.Arrays;
import java.util.Scanner;

public class diffofArr {
    public static  void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int[] a1=new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i]=scn.nextInt();
        }

        int n2=scn.nextInt();
        int [] a2=new int[n2];
        for(int i=0;i<a2.length;i++){
            a2[i]=scn.nextInt();
        }

        int []ans=new int[n2];
        int i=a1.length-1;
        int j=a2.length-1;
        int k=ans.length-1;
        int c=0;

while (k>=0) {
    int val=0;
    if (i>=0){
        val=a1[i];
    }else{
        val=0;
    }
    int d=0;
if (a2[j]+c>=val){
    d=a2[j]+c-val;
    c=0;
}else{
    d=a2[j]+c-val+10;
    c=-1;
}
    ans[k]=d;
i--;
j--;
k--;
}
        System.out.println(Arrays.toString(ans));
        }



    }

