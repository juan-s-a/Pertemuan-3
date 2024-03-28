package pertemuan.pkg3;

public class IfClass {
    public double totBeli, potongan;
    
    public void setTotalBeli(double a) {
        totBeli = a;
    }
    
    public double getPotongan() {
        if(totBeli >= 50000) {
            potongan = 0.2 * totBeli;
        }
        return potongan;
    }
    
    public double jumlahBayar() {
        return (totBeli - potongan);
    }
}
