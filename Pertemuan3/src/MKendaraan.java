public class MKendaraan {
    public static void main(String[] args) {

        // Membuat objek dengan konstruktor kosong
        Kendaraan k1 = new Kendaraan();

        // Menggunakan setter
        k1.setNopol("B1234CD");
        k1.setJenis("motor");

        // Menggunakan getter
        System.out.println("Nopol k1: " + k1.getNopol());
        System.out.println("Jenis k1: " + k1.getJenis());

        // Menggunakan method print
        System.out.println("\nData Kendaraan k1:");
        k1.printKendaraan();

        // Membuat objek dengan konstruktor berparameter
        Kendaraan k2 = new Kendaraan("D5678EF", "mobil");

        System.out.println("\nData Kendaraan k2:");
        k2.printKendaraan();

        // Contoh jenis tidak valid
        Kendaraan k3 = new Kendaraan();
        k3.setNopol("F9999ZZ");
        k3.setJenis("sepeda"); // tidak valid

        System.out.println("\nData Kendaraan k3:");
        k3.printKendaraan();

        // Menampilkan jumlah kendaraan yang dibuat
        System.out.println("\nJumlah Kendaraan: " + Kendaraan.getCountKendaraan());
    }
}