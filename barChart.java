import java.util.Scanner;

public class barChart {
    public static  void main(String []args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();
        }
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }

        for (int i = max; i >=1 ; i--) {//7-1

            for (int j = 0; j <arr.length ; j++) {// 3 1 0 7 5

                if (arr[j]>=i){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
