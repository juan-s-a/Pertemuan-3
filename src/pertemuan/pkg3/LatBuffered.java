package pertemuan.pkg3;
import java.io.*;

public class LatBuffered {
    public static void main(String[] args) throws Exception {
        InputStreamReader keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(keyreader);
        
        String kata1, kata2;
        
        System.out.print("Kata Pertama: ");
        kata1 = input.readLine();
        System.out.println("Kata Kedua: ");
        kata2 = input.readLine();
        System.out.println("Hasil Input String: " + kata1 + " " + kata2);
    }
}
