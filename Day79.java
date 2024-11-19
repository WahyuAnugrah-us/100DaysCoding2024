
class Mahasiswa {
    String nama;
    String nim;
    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    public String toString() {
        return "Nama: " + nama + ", Nim: " + nim;
    }
}
class serah_3 {
    public static void main(String[] args) {
        Mahasiswa x = new Mahasiswa("Wahyu", "D0224334");
        System.out.println(x.toString());
    }
}
