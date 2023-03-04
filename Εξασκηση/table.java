public class table {
    public static void main(String[] args) {
        int [][] table ={{2,2,2,2,2}, {2,2,2,2},{2,2,2} };
        int sum1=0;
        int sum2=0;
        int row[];
        int col[];
        for (int c=0; c<5; c++  ) {
            
            sum1+=table[0][c];
        }
        for (int c1=0; c1<4; c1++  ) {
            sum2+=table[1][c1];
        }
        /*for(int i=0; i<table.length; i++) {
            for (int j=0; j<table[i].length; j++) {
                 //sum1=table[i][] + sum1;
                 //sum1=table[i][0]+sum1;
               sum1=table[i][j]+sum1;
                //sum2=table[i][j]+sum2;
                //System.out.println(table[i].length);
            }
            //sum1=table[i][i]+sum1;
         //   sum1=table[i] + sum1;*/
        
       // System.out.println(table.length);
System.out.println(sum1);
System.out.println(sum2);
System.out.println(sum2+sum1);



    }
    
}
