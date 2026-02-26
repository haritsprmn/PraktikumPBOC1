public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        Titik T2 = T1;
        T2.printTitik();
        // kalau ga salah karena T2 menyimpan alamat T1 jadi jika T1 di ubah T2 ikut
        T1.setAbsis(9);
        T1.setOrdinat(3);
        T2.printTitik();

        Titik T3 = new Titik();
        T3.printTitik();
        Titik T4 = new Titik(7, 2);
        T4.printTitik();

        System.out.println("Jumlah Objek Titik: " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik: " + T2.getCounterTitik());
    }
}