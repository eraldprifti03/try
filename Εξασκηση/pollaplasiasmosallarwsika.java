import java.util.Scanner;

public class pollaplasiasmosallarwsika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER NUMBERS");
        int m1=in.nextInt();
        int m2=in.nextInt();
        int p=0;
        while(m2>0) {
            if(m2%2==1) {
                p+=m1;
            }
            m1=m1*2;
            m2=m2/2;
            }
   System.out.println(p);
    }

   
}

