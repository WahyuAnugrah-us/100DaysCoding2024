package wahyuAnugrahCommit;

import java.util.Arrays;

public class day2 {
    public static void main(String[] args) {
        System.out.print("day 2");//perintah mencetak nilai ke console
        System.out.println(".");//perintah mencetak nilai ke console dengan tambahan newline
        /*
        format printf
        %[flags][width][.precision]conversion
        %-karakter wajib untuk menandai format
        [flags]-opsi[-]-untuk meratakan ke kiri(defaulnya adalah kanan)
                    [+]menampilkan tanda plus/minus angka
                    [0]menambahkan nol jika lebar tidak mencukupi
                    [,]menambahkan pemisah ribuan pada angka(10,000,000)
        [widh]-opsi-menentukan lebar karakter yang akan dicetak
        [.precision]-menentukan jumlah digit di belakang koma
        conversion-karakter untuk menentukan tipe data
                   %s	String-mencetak nilai String.
                   %d	Integer-mencetak bilangan bulat (byte, short, int, long).
                   %f	Floating-mencetak bilangan desimal (float, double).
                   %c	Character-mencetak satu karakter.
                   %b	Boolean-mencetak nilai true atau false.
                   %n	Newline-Untuk membuat baris baru.
                   %%	Persen	Untuk mencetak simbol persen (%).
         */
        System.out.printf("nama mahasiswa %s%numur mahasiswa %d tahun%ntinggi %.1fcm dengan golongan darah %c%nstatus keaktifan :%b dengan kehadiran 80%%%n","Wahyu",19,164.6,'B',true);
        /*
        %s%n pada code berarti tipe datanya adalah String dan setelah itu buat garis baru
        %d pada code berarti tipe datanya adalah angka bulat (byte,short,int,long)
        %n berarti buat garis baru
        %.1f pada code berarti tipe datanya adalah angka desimal (float, double) dengan 1 angka dibelakang koma
           %.1 untuk satu angka dibelakang koma dan f untuk angka desimal
        %c%n pada code berarti tipe datanya adalah character dan setelah itu buat garis baru
        &b pada code berarti tipe datanya adalah bolean(hanya true dan false)
        %%%n berarti mencetak % secara harfiah dan membuat garis baru
           %% untuk mencetak persen dan &n untuk garis baru
         */
        System.out.printf("+---------------------------------------------------+%n");
        System.out.printf("|%-25s %25s|%n" ,"nama produk","harga(RP)");
        System.out.printf("+---------------------------------------------------+%n");
        System.out.printf("|%-25s %,25.2f|%n","Amerikano", 15000.);//karena tidak ada angka dibelakang koma tapi precisionnya [.2], maka otomatis akan terisi 2 angka 0 dibelakang koma
        System.out.printf("|%-25s %,25.2f|%n","bakso", 20000.);
        System.out.printf("|%-25s %,25.2f|%n","es teh tawar", 5000.);
        System.out.printf("+---------------------------------------------------+%n");
        /*
        %-25s [-] adalah flags [25] adalah width [s] adalah conversion == tulisan akan diratakan kekiri dengan lebar 25 karakter menggunakan tipe data String
        %25s [25] adalah width [s] adalah conversion == (tulisan akan diratakan ke kanan secara default)tulisan dibuat dengan lebar 25 karakter dan hanya bisa menggunakan tipe data String
        %,25.2f [,]adalah flags [25] adalah width [.2] adalah precision [f] adalah conversion == tulisan dicetak dengan memisahkan tiap ribuan dengan lebar 25 karakter dan mengambil 2 angka dibelakang koma, hanya menerima input angka desimal
        %n untuk membuat garis baru
        */
    }
}
