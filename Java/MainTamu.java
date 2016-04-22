package maintamu;
import java.util.Scanner;
public class MainTamu {
    public static void main(String[] args) {
        Scanner carbin = new Scanner(System.in);
        int a = 0;
        int b = 1;
        do{
            System.out.println("BUKU TAMU");
            
            System.out.print("Masukkan nama : ");
            String nama = carbin.next();
            Tamu.nama(nama, a);
            
            System.out.print("Masukkan alamat : ");
            String alamat = carbin.next();
            Tamu.alamat(alamat, a);
            
            Tamu.tampil();
            a++;
            
            System.out.print("Ingin menambahkan lagi?(y/n)");
            String pilih = carbin.next();
            
            if(pilih.equalsIgnoreCase("n")){
                b=0;
            }
            
        }while(b!=0);
    }
}
