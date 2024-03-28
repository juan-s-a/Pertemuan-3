package pertemuan.pkg3;
import java.util.Scanner;

public class IfElseClass {
    public String nama, ket;
    public int nilAkhir;
    Scanner input = new Scanner(System.in);
    
    public void setInputData() 
    {
        System.out.print("Masukkan Nama Siswa: ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai Akhir: ");
        nilAkhir = input.nextInt();
    }
        
    public String getKeterangan()
    {
        if(nilAkhir > 70) {
            ket = "Lulus";
        } else {
            ket = "Gagal";
        }
        return ket;
    }
}
