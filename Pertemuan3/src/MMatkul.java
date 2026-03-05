public class MMatkul {
    public static void main(String[] args) {

        // Membuat objek dengan konstruktor default
        MataKuliah m1 = new MataKuliah();

        // Menggunakan setter
        m1.setIdMatkul("IF101");
        m1.setNama("Pemrograman Java");
        m1.setSks(3);

        // Menggunakan getter
        System.out.println("ID Matkul m1: " + m1.getIdMatkul());
        System.out.println("Nama Matkul m1: " + m1.getNama());
        System.out.println("SKS m1: " + m1.getSks());

        // Menggunakan method print
        System.out.println("\nData Mata Kuliah m1:");
        m1.printMatkul();

        // Membuat objek dengan konstruktor parameter
        MataKuliah m2 = new MataKuliah("IF202", "Struktur Data", 3);

        System.out.println("\nData Mata Kuliah m2:");
        m2.printMatkul();

        // Mengubah data mata kuliah kedua
        m2.setNama("Algoritma dan Struktur Data");
        m2.setSks(4);

        System.out.println("\nData Mata Kuliah m2 setelah diubah:");
        m2.printMatkul();

        // Menampilkan jumlah mata kuliah yang dibuat
        System.out.println("\nJumlah Mata Kuliah: " + MataKuliah.getCountMatkul());
    }
}
