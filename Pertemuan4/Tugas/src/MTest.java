public class MTest {
    public static void main(String[] args) {

        // ================== TEST TANGGAL ==================
        Tanggal tgl1 = new Tanggal(10, 3, 2000);
        Tanggal tgl2 = new Tanggal(1, 1, 2020);

        // ================== TEST DOSEN TETAP ==================
        DosenTetap dt1 = new DosenTetap(
                "003", "Ahmad", tgl1, tgl2,
                7000000, "Teknik", "12345"
        );

        dt1.printInfo();
        System.out.println("NIDN: " + dt1.getNIDN());
        System.out.println("BUP: " + dt1.getBUP());
        System.out.println("Tanggal Pensiun: " + dt1.getTglPensiun().printTanggal());

        DosenTetap.printCountDosenTetap();

        // ================== TEST DOSEN TAMU ==================
        Tanggal endKontrak = new Tanggal(1, 1, 2027);

        DosenTamu dTamu = new DosenTamu(
                "004", "Rina", tgl1, tgl2,
                6500000, "Ekonomi", "67890", endKontrak
        );

        dTamu.printInfo();
        System.out.println("NIDK: " + dTamu.getNIDK());
        System.out.println("End Kontrak: " + dTamu.getEndKontrak().printTanggal());
        System.out.println("Sisa Kontrak: " + dTamu.getSisaKontrakBulan() + " bulan");

        DosenTamu.printCountDosenTamu();

        // ================== TEST TENDIK ==================
        Tendik t1 = new Tendik(
                "005", "Joko", tgl1, tgl2,
                4000000, "Administrasi"
        );

        t1.printInfo();
        System.out.println("Bidang: " + t1.getBidang());
        System.out.println("Tanggal Pensiun: " + t1.getTglPensiun().printTanggal());

        
        // ================== TOTAL SEMUA ==================
        Dosen.printCountDosen();
        Tendik.printCountTendik();
        Pegawai.printCountPegawai();
    }
}
