package maintamu;
public class Tamu {
    
    private static int A=1;
    private static final String v[][]= new String [3][25];
    public static void nama(String a, int b){
        v[1][b] = a;
        String x  = Integer.toString(A);
        v[0][b] = x;
    }
    
    public static void alamat(String a,int b){
        v[2][b] = a;
    }
    
    public static void tampil(){
        System.out.println("ID\tNama\tAlamat");
        for(int i=0; i<A; i++){
            for(int j=0; j<3; j++){
                System.out.println(" "+v[j][i]+"\t");
                if(j==2){
                System.out.print("\t");
                }
            }
            System.out.println("");
        }
        A++;
    }
}
