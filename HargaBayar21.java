import java.util.Scanner;

/**
 * HargaBayar21
 */
public class HargaBayar21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, jmlHlmBuku;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukkan merk buku: ");
        merkBuku = input.next();
        System.out.println("Masukkan jumlah halaman buku: ");
        jmlHlmBuku = input.nextInt();
        System.out.println("Masukkan diskon: ");
        dis = input.nextDouble();
        System.out.println("Masukkan harga barang yang di beli: ");
        harga = input.nextInt();
        System.out.println("Masukkan jumlah barang yang di beli: ");
        jumlah = input.nextInt();

        total= harga*jumlah;
        jmlDis= total*dis;
        bayar = total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus di bayar adalah " + bayar);
    }
}