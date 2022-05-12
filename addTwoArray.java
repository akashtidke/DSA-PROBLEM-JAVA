import java.util.Scanner;

public class addTwoArray {
    public static  void main (String []args){
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


        int max=Math.max(n1,n2);

        int[]ans=new int[max];
        int i=a1.length-1;
        int j=a2.length-1;
        int k=ans.length-1;
        int c=0;
        while (k>=0){
            int add=c;
            if (i>=0){
                add+=a1[i];
            }
            if (j>=0){
                add+=a2[j];
            }

if (add>=10){

    add-=10;
    c=1;

}else{
   c=0;

}
ans[k]=add;
            i--;
            j--;
            k--;


        }

        for (int l = 0; l < ans.length; l++) {
            if(l==0&&ans[l]==0){

            }else{
                System.out.println(ans[l]);
            }
        }


    }
}
