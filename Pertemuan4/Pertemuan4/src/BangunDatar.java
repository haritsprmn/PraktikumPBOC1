public class BangunDatar {
    // Atribut
    private int jmlhSisi;
    private String warna;
    private String border;
    private static int countBangunDatar;

    // Method
    // Konstruktor
    public BangunDatar() {
        this("null", "null", 0);
    }

    public BangunDatar(String warna, String border, int jmlSisi) {
        this.jmlhSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        countBangunDatar++;

    }

    // Selektor
    public int getJmlhSisi() {
        return jmlhSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    // Mutator
    public void setJmlhSisi(int jmlSisi) {
        this.jmlhSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // Menampilkan
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlhSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public static void printCountBangunDatar() {
        System.out.println("Jumlah bangun datar: " + countBangunDatar);
    }
}