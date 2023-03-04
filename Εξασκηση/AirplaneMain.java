import java.util.Scanner;

public class AirplaneMain {
public static void main(String[] args) {
    
    
Airplanetest plane = new Airplanetest();
Scanner in = new Scanner(System.in);

int input;
boolean array[] =new boolean[11];
/*for( int i = 0; i < array.length; i++) {
   // System.out.println(array[i]);
    if(array[i]==false) {
    array[i]=true;
    System.out.println(array[i]); }
}*/
int i=0;
int j=5;
for(int k=1; k<=11; k++){
//do {
System.out.println("Chosse 1 for economical seat, chose 2 for first class seat");
input=in.nextInt();


    if (input==1) {
    i++;    
if(plane.air1(array,i)){
    System.out.println("your seat is " + i);

} 

  
   // System.out.println("Chosse 1 for economical seat, chose 2 for first class seat");
    //input=in.nextInt();

 else {
    System.out.println("Your flight is in 3 hours");
 //   System.out.println("Chosse 1 for economical seat, chose 2 for first class seat");
   // input=in.nextInt();
}

 


} else {
    try{
    j++;
if(plane.air2(array,j)) {
    System.out.println("your seat is " +j);
   // System.out.println("Chosse 1 for economical seat, chose 2 for first class seat");
//input=in.nextInt();
} else {
    System.out.println("Your flight is in 3 hours");
//    System.out.println("Chosse 1 for economical seat, chose 2 for first class seat");
//input=in.nextInt();
}
    
}   
 catch(ArrayIndexOutOfBoundsException e){
System.out.println("Your flight is in 3 hours" ); }

}
}//while(input!=-1);
   

} 
}






/* /* */




