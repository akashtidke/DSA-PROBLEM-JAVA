import java.util.Scanner;

public class faultykeyboardLeetcode925 {
    public static  void  main (String []args){
        Scanner scn=new Scanner(System.in);
        String str1=scn.nextLine();
        String str2=scn.nextLine();
        boolean val=fk(str1,str2);
        System.out.println(val);
    }

    static boolean fk(String str1,String str2){
        if (str1.length()>str2.length()){
            return false;
        }
        int i=0;
        int j=0;
        while (str1.length()>i&&str2.length()>j){
            if (str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            }else if(i>0&&str1.charAt(i-1)==str2.charAt(j)){
                j++;
            }else{
                return  false;
            }
        }
        while (j<str2.length()){
            if (str1.charAt(str1.length()-1)!=str2.charAt(j)){
                return false;
            }
            j++;
        }

        if (i<str1.length()){
            return false;
        }





        return true;
    }
}
