package pertemuan.pkg3;

public class AksiScanner {
    public static void main(String[] args) {
        ClassScanner scan = new ClassScanner();
        
        scan.inputScanner();
        System.out.println("Nama Anda: " + scan.getnama());
        System.out.println("Nilai Anda: " + scan.rata());
    }
}
