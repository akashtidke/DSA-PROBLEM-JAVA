import java.sql.SQLOutput;
import java.util.Scanner;

public class FIndElinArr {
    public  static void main(String []args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= scn.nextInt();
        }
        int d=scn.nextInt();
        int ans=finde(arr,d);
        System.out.println(ans);
    }
    static int finde(int []arr,int d){
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==d){
                index=i;
            }
        }
        return index;
    }
}
