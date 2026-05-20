// Nama File    : MainPiaraan.java
// Deskripsi    : aplikasi untuk menguji kelas Piaraan dan antrean objek Anabul.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 07/05/2026

package Nomor_2;

public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan antreanKlinik = new Piaraan();

        Anabul miko = new Kucing("Miko", 4.2);
        Anabul snowy = new Anggora("Snowy", 3.8);
        Anabul telu = new Kembangtelon("Telu", 4.5);
        Anabul doggo = new Anjing("Doggo");
        Anabul rio = new Burung("Rio");

        antreanKlinik.enqueueAnabul(miko);
        antreanKlinik.enqueueAnabul(snowy);
        antreanKlinik.enqueueAnabul(telu);
        antreanKlinik.enqueueAnabul(doggo);
        antreanKlinik.enqueueAnabul(rio);

        System.out.println("Daftar nama panggilan anabul dalam antrean:");
        antreanKlinik.showAnabul();

        System.out.println("\nJumlah anabul dalam antrean: " + antreanKlinik.getNbelm());
        System.out.println("Apakah Snowy ada dalam antrean? " + antreanKlinik.isMember(snowy));
        System.out.println("Anabul pertama: " + antreanKlinik.getAnabul().getNama());

        System.out.println("\nJumlah keluarga kucing: " + antreanKlinik.countKucing());
        System.out.println("Total bobot keluarga kucing: " + antreanKlinik.bobotKucing() + " kg");

        System.out.println("\nNama panggilan dan jenis anabul:");
        antreanKlinik.showJenisAnabul();

        Anabul keluar = antreanKlinik.dequeueAnabul();
        System.out.println("\nAnabul yang keluar dari antrean: " + keluar.getNama());
        System.out.println("Anabul pertama setelah dequeue: " + antreanKlinik.getAnabul().getNama());
        System.out.println("Jumlah anabul setelah dequeue: " + antreanKlinik.getNbelm());
    }
}
