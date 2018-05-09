import java.util.Scanner;

public class math {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int data[] = new int[6];
        int a=0;
        int b=0;
        int c=0;
        for (int i = 0; i < 6; i++) {
            data[i] = scn.nextInt();
        }
        for (int j =0; j<6 ;j++) {
           if(data[j]>0){
              a++;
           }else if(data[j]<0){
               b++;
           }else if(data[j]==0){
               c++;
           }
        }

        System.out.println("+= "+a);
        System.out.println("-= "+b);
        System.out.println("0= "+c);
    }
}