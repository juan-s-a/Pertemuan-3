package pertemuan.pkg3;

public class IfElseAksi {
    public static void main(String[] args)
    {
        IfElseClass ifclass = new IfElseClass();
        
        ifclass.setInputData();
        ifclass.getKeterangan();
        System.out.println("Hasil Akhir: ");
        System.out.println("================================");
        System.out.println("Nama Siswa               : " + ifclass.nama);
        System.out.println("Nilai Final              : " + ifclass.nilAkhir);
        System.out.println("Keterangan Akhir         : " + ifclass.getKeterangan());
    }
}
