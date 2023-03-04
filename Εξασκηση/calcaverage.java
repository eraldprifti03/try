import java.util.Scanner;

public class calcaverage {
    
    double mean;
    int sum=0;
    int count=0;
    int grade;
    
public double average() {
    Scanner in = new Scanner(System.in); 
    do {
        System.out.println("Enter grade");
        grade=in.nextInt();
        
        while(grade<0) {
            System.out.print("Enter a valid grade");
            grade=in.nextInt();
        }
        sum+=grade;
        count=count+1;
        do{
        System.out.print("New grade:?");
        String an=in.nextLine();
        mean=sum/count;
         } while(an=="NO");
        
        
         
          
    } while(grade>=0);
 return mean;
}
  
    }
