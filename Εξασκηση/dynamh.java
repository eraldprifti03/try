public class dynamh {
    public static void main(String[] args) {
        System.out.println(dyname(2,5));
     /*   int a=2;
        int n=4;
        int apotel=0;
    */}
    public static int dyname(int a,int n) {    
        int apotel=1;
        for(int i=1; i<=n; i++) {  
        apotel=apotel*a;
        }
        return apotel;
//System.out.println(apotel);
    }


}