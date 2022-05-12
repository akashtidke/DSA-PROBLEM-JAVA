import java.util.Arrays;
import java.util.Scanner;

public class squareofSortedArray {
    public static  void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=scn.nextInt();
        }
        int[]ans=new int[n];
        int i=0;
        int j=arr.length-1;
        int k=ans.length-1;
        while(i<=j){
            if (arr[i]*arr[i]>arr[j]*arr[j]){
                ans[k]=arr[i]*arr[i];
                i++;
                k--;

            }else{
                ans[k]=arr[j]*arr[j];
                j--;
                k--;
            }

        }
        System.out.println(Arrays.toString(ans));

    }
}
