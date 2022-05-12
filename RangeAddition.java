import java.util.Scanner;

public class RangeAddition {




        // This is a functional problem. You have to complete this function.
        // It takes as input a length and a 2D array of update operations.
        // It should return the modified array.
        public static int[] Range(int length, int[][] updates) {
            // write your code here.
            int []res=new int[length];

            for(int i=0;i<updates.length;i++){

                int start=updates[i][0];
                int end=updates[i][1];
                int data=updates[i][2];
                res[start]+=data;

                if(end+1<length){
                    res[end+1]-=data;
                }

            }
            int sum=0;
            for(int i=0;i<res.length;i++){
                sum+=res[i];
                res[i]=sum;
            }
            return res;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input for length of first array.
            int length = sc.nextInt();

            int K = sc.nextInt();

            int[][] updates = new int[K][3];

            for (int i = 0; i < updates.length; i++) {
                for (int j = 0; j < updates[0].length; j++) {
                    updates[i][j] = sc.nextInt();
                }
            }

            int[] result = Range(length, updates);
            display(result);
        }

        // function to display an array.
        public static void display(int[] arr) {

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }


}
