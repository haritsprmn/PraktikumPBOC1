public class MDosen {
    public static void main(String[] args) {

        // Membuat objek dengan konstruktor default
        Dosen d1 = new Dosen();

        // Menggunakan mutator
        d1.setNip("198765");
        d1.setNama("Dr. Budi");
        d1.setProdi("Informatika");

        // Menggunakan selektor
        System.out.println("NIP d1: " + d1.getNip());
        System.out.println("Nama d1: " + d1.getNama());
        System.out.println("Prodi d1: " + d1.getProdi());

        // Menggunakan method print
        System.out.println("\nData Dosen d1:");
        d1.printDosen();

        // Membuat objek dengan konstruktor parameter
        Dosen d2 = new Dosen("123456", "Dr. Sari", "Sistem Informasi");

        System.out.println("\nData Dosen d2:");
        d2.printDosen();

        // Mengubah data dosen kedua
        d2.setNama("Dr. Sari Wulandari");
        d2.setProdi("Teknik Informatika");

        System.out.println("\nData Dosen d2 setelah diubah:");
        d2.printDosen();

        // Menampilkan jumlah dosen yang dibuat
        System.out.println("\nJumlah Dosen: " + Dosen.getCountDosen());
    }
}
