package pertemuan.pkg3;
import java.util.*;

public class LatIf {
    public static void main(String[] args) {
        double tot_beli, potongan = 0, jum_bayar = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Total Pembelian: Rp. ");
        tot_beli = input.nextDouble();
        if(tot_beli >= 50000)
            potongan = 0.2 * tot_beli;
        System.out.println("Besarnya Potongan: Rp. " + potongan);
        jum_bayar = tot_beli - potongan;
        System.out.println("Jumlah yang Harus Dibayarkan: Rp. " + jum_bayar);
    }
}
