public class table1 {
public static void main(String[] args) {
    
    
//public void calc(int[][] table) {
    int[][] table={{2,2,2,2},{2,2,2,2}};
    int[] row=new int[2];
    int[] col=new int[4];
    int sum=0;
    int m=2;
    int n=4;
 /*    for(int i=0; i<m; i++) {
        row[i]=0;
    }

    
    for(int j=0; j<m; j++) {
        col[j]=0;
    }
*/
    
    for(int r=0; r<m; r++) {
       
       
    for(int c=0; c<n; c++) {
      // row[r]=0; 
        sum+=table[r][c];
        row[r]+=table[r][c];
        col[c]+=table[r][c];
    }
    }

    System.out.println(sum);
    for(int i=0; i<row.length; i++)
    System.out.printf( "%d",row[i]);
    System.out.println();
    for(int j=0; j<col.length; j++)
    System.out.printf("%d",col[j]);
}

    

}