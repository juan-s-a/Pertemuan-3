package pertemuan.pkg3;
import java.util.Scanner;

public class Pertemuan3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama;
        int n2;
        double n1, n3;
        
        System.out.print("Masukkan Nama Anda: ");
        nama = input.nextLine();
        System.out.print("Masukkan Nilai 1: ");
        n1 = input.nextDouble();
        System.out.print("Masukkan Nilai 2: ");
        n2 = input.nextInt();
        
        n3 = n1 + n2;
        System.out.println("Nama Anda: " + nama);
        System.out.println("Nilai Anda: " + n3);
    }
    
}
