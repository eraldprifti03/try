import java.util.Scanner;

public class averegae {
    public static void main(String[] args) {
      double mean;
      int sum=0;
      int count=0;
      int grade;
      char an;
      Scanner in = new Scanner(System.in); 
      do {
        do {
          System.out.println("Enter grade");
          grade=in.nextInt();
          if(grade<=0){
            System.out.print("Enter a valid grade");
          
        }
        } while(grade<=0); 
          
          sum+=grade;
          count=count+1;
          System.out.print("New grade:? ");
          an=in.next().charAt(0);

           
      } while(an != 'N');
      mean=(double)sum/count;
      System.out.println(mean);
}
}
