public class MBangunDatar {
    public static void main(String[] args) {
        // =========================
        // UJI CLASS BangunDatar
        // =========================
        System.out.println("===== UJI BangunDatar =====");

        BangunDatar b1 = new BangunDatar();
        BangunDatar b2 = new BangunDatar("Merah", "Hitam", 4);

        System.out.println(">> BangunDatar b1 (default)");
        b1.printInfo();
        System.out.println("Getter jumlah sisi: " + b1.getJmlhSisi());
        System.out.println("Getter warna: " + b1.getWarna());
        System.out.println("Getter border: " + b1.getBorder());
        System.out.println();

        System.out.println(">> BangunDatar b2 (parameter)");
        b2.printInfo();
        System.out.println("Getter jumlah sisi: " + b2.getJmlhSisi());
        System.out.println("Getter warna: " + b2.getWarna());
        System.out.println("Getter border: " + b2.getBorder());
        System.out.println();

        System.out.println(">> Uji Mutator b1");
        b1.setJmlhSisi(3);
        b1.setWarna("Biru");
        b1.setBorder("Putih");
        b1.printInfo();
        System.out.println();

        // =========================
        // UJI CLASS Persegi
        // =========================
        System.out.println("===== UJI Persegi =====");

        Persegi p1 = new Persegi();
        Persegi p2 = new Persegi(5, "Hijau", "Kuning");

        System.out.println(">> Persegi p1 (default)");
        p1.printInfo();
        System.out.println("Getter sisi: " + p1.getSisi());
        System.out.println("Luas: " + p1.getLuas());
        System.out.println("Keliling: " + p1.getKeliling());
        System.out.println("Diagonal: " + p1.getDiagonal());
        System.out.println("Getter jumlah sisi: " + p1.getJmlhSisi());
        System.out.println("Getter warna: " + p1.getWarna());
        System.out.println("Getter border: " + p1.getBorder());
        System.out.println();

        System.out.println(">> Persegi p2 (parameter)");
        p2.printInfo();
        System.out.println("Getter sisi: " + p2.getSisi());
        System.out.println("Luas: " + p2.getLuas());
        System.out.println("Keliling: " + p2.getKeliling());
        System.out.println("Diagonal: " + p2.getDiagonal());
        System.out.println("Getter jumlah sisi: " + p2.getJmlhSisi());
        System.out.println("Getter warna: " + p2.getWarna());
        System.out.println("Getter border: " + p2.getBorder());
        System.out.println();

        System.out.println(">> Uji Mutator p1");
        p1.setSisi(8);
        p1.setWarna("Ungu");
        p1.setBorder("Abu");
        p1.setJmlhSisi(4);
        p1.printInfo();
        System.out.println();

        // =========================
        // UJI CLASS Lingkaran
        // =========================
        System.out.println("===== UJI Lingkaran =====");

        Lingkaran l1 = new Lingkaran();
        Lingkaran l2 = new Lingkaran("Pink", "Hitam", 7);

        System.out.println(">> Lingkaran l1 (default)");
        l1.printInfo();
        System.out.println("Getter jari: " + l1.getJari());
        System.out.println("Luas: " + l1.getLuas());
        System.out.println("Keliling: " + l1.getKeliling());
        System.out.println("Getter jumlah sisi: " + l1.getJmlhSisi());
        System.out.println("Getter warna: " + l1.getWarna());
        System.out.println("Getter border: " + l1.getBorder());
        System.out.println();

        System.out.println(">> Lingkaran l2 (parameter)");
        l2.printInfo();
        System.out.println("Getter jari: " + l2.getJari());
        System.out.println("Luas: " + l2.getLuas());
        System.out.println("Keliling: " + l2.getKeliling());
        System.out.println("Getter jumlah sisi: " + l2.getJmlhSisi());
        System.out.println("Getter warna: " + l2.getWarna());
        System.out.println("Getter border: " + l2.getBorder());
        System.out.println();

        System.out.println(">> Uji Mutator l1");
        l1.setJari(10);
        l1.setWarna("Orange");
        l1.setBorder("Coklat");
        l1.setJmlhSisi(1);
        l1.printInfo();
        System.out.println();

        // =========================
        // UJI COUNTER
        // =========================
        System.out.println("===== UJI COUNTER =====");
        BangunDatar.printCountBangunDatar();
        Persegi.printCountPersegi();
        Lingkaran.printCountLingkaran();
    }
}