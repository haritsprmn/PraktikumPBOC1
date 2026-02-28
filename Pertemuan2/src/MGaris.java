public class MGaris {

    public static void main(String[] args) {

        // ===============================
        // TEST KONSTRUKTOR DEFAULT
        // ===============================
        Garis G0 = new Garis();
        System.out.println("=== Garis Default G0 ===");
        G0.printGaris();
        System.out.println("Panjang: " + G0.getPanjang());
        System.out.println("Gradien: " + G0.getGradien());
        System.out.println("Titik Tengah: (" +
                G0.getTitikTengah().getAbsis() + ", " +
                G0.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan: " + G0.printPersamaan());
        System.out.println();

        // ===============================
        // TEST KONSTRUKTOR PARAMETER
        // ===============================
        Titik T1 = new Titik(-2, 0);
        Titik T2 = new Titik(0, 4);
        Garis G1 = new Garis(T1, T2);

        System.out.println("=== Garis G1 ===");
        G1.printGaris();
        System.out.println("Panjang: " + G1.getPanjang());
        System.out.println("Gradien: " + G1.getGradien());
        System.out.println("Titik Tengah: (" +
                G1.getTitikTengah().getAbsis() + ", " +
                G1.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan: " + G1.printPersamaan());
        System.out.println();

        // ===============================
        // TEST SETTER
        // ===============================
        Titik T3 = new Titik(0, 0);
        Titik T4 = new Titik(4, 0);
        G1.setTitikAwal(T3);
        G1.setTitikAkhir(T4);

        System.out.println("=== Setelah Setter G1 ===");
        G1.printGaris();
        System.out.println("Gradien: " + G1.getGradien());
        System.out.println("Persamaan: " + G1.printPersamaan());
        System.out.println();

        // ===============================
        // TEST SEJAJAR & TEGAK LURUS
        // ===============================
        Garis G2 = new Garis(new Titik(1, 1), new Titik(5, 1)); // horizontal
        Garis G3 = new Garis(new Titik(2, 0), new Titik(2, 5)); // vertikal

        System.out.println("G2 sejajar G1? " + G2.isSejajar(G1));
        System.out.println("G2 tegak lurus G3? " + G2.isTegakLurus(G3));
        System.out.println();

        // ===============================
        // TEST COUNTER
        // ===============================
        System.out.println("Jumlah objek Garis: " + Garis.getCountGaris());
    }
}