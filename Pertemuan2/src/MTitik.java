public class MTitik {

    public static void main(String[] args) {

        // ===============================
        // TEST KONSTRUKTOR DEFAULT
        // ===============================
        Titik T0 = new Titik();
        System.out.println("=== Titik Default T0 ===");
        T0.printTitik();
        System.out.println("Jarak ke pusat: " + T0.getJarakPusat());
        System.out.println("Kuadran: " + T0.getKuadran());
        System.out.println();

        // ===============================
        // TEST KONSTRUKTOR PARAMETER
        // ===============================
        Titik T1 = new Titik(3, 4);
        System.out.println("=== Titik T1 (3,4) ===");
        T1.printTitik();
        System.out.println("Absis: " + T1.getAbsis());
        System.out.println("Ordinat: " + T1.getOrdinat());
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat());
        System.out.println("Kuadran: " + T1.getKuadran());
        System.out.println();

        // ===============================
        // TEST SETTER
        // ===============================
        T1.setAbsis(-5);
        T1.setOrdinat(6);
        System.out.println("=== Setelah Setter T1 ===");
        T1.printTitik();
        System.out.println("Kuadran: " + T1.getKuadran());
        System.out.println();

        // ===============================
        // TEST GESER
        // ===============================
        T1.geser(2, -3);
        System.out.println("=== Setelah Geser T1 (2,-3) ===");
        T1.printTitik();
        System.out.println();

        // ===============================
        // TEST JARAK ANTAR TITIK
        // ===============================
        Titik T2 = new Titik(1, 1);
        System.out.println("=== Titik T2 (1,1) ===");
        T2.printTitik();
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));
        System.out.println();

        // ===============================
        // TEST REFLEKSI (UBAH OBJEK)
        // ===============================
        System.out.println("=== Refleksi X T2 (ubah objek) ===");
        T2.refleksiX();
        T2.printTitik();

        System.out.println("=== Refleksi Y T2 (ubah objek) ===");
        T2.refleksiY();
        T2.printTitik();
        System.out.println();

        // ===============================
        // TEST GET REFLEKSI (OBJEK BARU)
        // ===============================
        Titik T3 = new Titik(2, -3);
        System.out.println("=== Titik T3 (2,-3) ===");
        T3.printTitik();

        Titik RX = T3.getRefleksiX();
        Titik RY = T3.getRefleksiY();

        System.out.println("Refleksi X (objek baru): ");
        RX.printTitik();

        System.out.println("Refleksi Y (objek baru): ");
        RY.printTitik();
        System.out.println();

        // ===============================
        // TEST COUNTER
        // ===============================
        System.out.println("Jumlah objek Titik: " + Titik.getCounterTitik());
    }
}