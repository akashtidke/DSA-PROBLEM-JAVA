import java.util.*;
public class isPrime {
    public static  void main(String[]args){
        Scanner scn =new Scanner(System.in);
        int low=scn.nextInt();
        int high=scn.nextInt();

        for (int i = low; i <=high ; i++) {

             boolean isPrime=true;

            for (int j = 2; j*j <=low ; j++) {

                if (i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime==true){
                System.out.println(i);
            }


    }
}
}
