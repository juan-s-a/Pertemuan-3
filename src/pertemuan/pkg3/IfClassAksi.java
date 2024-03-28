package pertemuan.pkg3;
import java.util.Scanner;

public class IfClassAksi {
    public static void main(String[] args)
    {
        double totBeli;
        Scanner input = new Scanner(System.in);
        IfClass fungsiif = new IfClass();
        
        System.out.print("Total Pembelian: ");
        fungsiif.totBeli = input.nextDouble();
        
        System.out.println("Besarnya Potongan: Rp. " + fungsiif.getPotongan());
        System.out.println("Jumlah yang Harus Dibayarkan: " + fungsiif.jumlahBayar());
    }
}
