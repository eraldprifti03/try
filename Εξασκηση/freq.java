public class freq {
   public static void main(String[] args) {
    
   
    int[] array={2,2,3,3,3,3,5,6,6,6,6,6,7};
 int s=0;
 int i=0;
 int lastn=array[i];

 while(i<array.length) {
    if(lastn!=array[i]) {
       System.out.println(lastn + " " + s);
        lastn=array[i];
        s=0;
    }
    i++;
    s++;
   
}

System.out.println(lastn +" "+ s); 
 
    







}
}