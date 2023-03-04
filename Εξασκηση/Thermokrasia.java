public class Thermokrasia {
public static void main(String[] args) {
    double sum=0;
    int[] thermo ={10,4,20,15,18,3,29,23,12};
    int n=thermo.length;

    int max=0;
    int index;
    for(int i=0; i<thermo.length; i++) {
        if(max<thermo[i]) {
            max=thermo[i];
            index=i;
        }
    }
    System.out.print("The max is "+ max);












}
}

    //    System.out.println(n);
 //   double temp;
/* 
for (int i=0; i<9; i++)
System.out.println(array(thermo));
  /*  for(int i=0; i<thermo.length; i++){
        sum+=thermo[i];
    }
    double mean=sum/10;
System.out.println("h mesh thermo einai "+mean);
int count=0;
for(int j=0; j<thermo.length; j++) {
    if (thermo[j]<=mean)
    count++;
}
System.out.println("mikrotero apo meso" + count);
*/
/* 
public static void array(double[] thermo) {
for(int i=1; i<9; i++) {
    for(int j=9; j<i; j--) {
        if(thermo[j-1]>thermo[j]) {
      double temp=thermo[j-1];
            thermo[j-1]=thermo[j];
            thermo[j]=temp;
         // System.out.print(thermo[j]);
        }
       
    }  
    //System.out.println(thermo[i]);
}
        }
        /*for(int a=0; a<9; a++) {
        System.out.println(thermo[a]);
        
        }
   
*/



