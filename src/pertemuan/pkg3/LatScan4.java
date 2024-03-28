package pertemuan.pkg3;
import java.util.*;

public class LatScan4 {
    public static void main(String[] args) {
        int kd;
        String nb = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kode Barang: ");
        kd = input.nextInt();
        
        switch(kd) {
            case 1:
                nb = "Alat Olahraga";
                break;
            case 2:
                nb = "Alat Elektronik";
                break;
            case 3:
                nb = "Alat masak";
                break;
            default:
                nb = "Anda Salah Kode!!";
                break;
        }
        System.out.println("Nama Barang: " + nb);
    }
}
