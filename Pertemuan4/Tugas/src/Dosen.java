public class Dosen extends Pegawai{
    // Atribut
    private String Fakultas;
    private static int countDosen;

    // Method
    // Konstruktor
    public Dosen(){
        this("NULL", "NULL", new Tanggal(0,0,0), new Tanggal(0,0,0), 0, "NULL");
    }
    public Dosen(String NIP, String Nama, Tanggal TglLahir, Tanggal TMT, double GajiPokok, String Fakultas){
        super(NIP, Nama, TglLahir, TMT, GajiPokok);
        this.Fakultas = Fakultas; 
        countDosen++;
    }

    // Selektor
    public String getFakultas(){
        return Fakultas;
    }

    // Mutator
    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }

    // Menampilkan
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas : " + Fakultas);
    }
    public static void printCountDosen(){
        System.out.println("Total dosen : " + countDosen);
    }
}
