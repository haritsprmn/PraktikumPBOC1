/*  Nama File   : AngkaSial.java 
    Deskripsi   : program penggunaan exception buatan sendiri Pengenalan klausa "throw" dan "throws"
    Pembuat     : Harits Permana
    Tanggal     : 16 - 04 - 2026
*/

public class AngkaSial {
    public void CobaAngka(int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }

        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.CobaAngka(10);
            as.CobaAngka(13);
            as.CobaAngka(12);
        } catch(AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!");
        } finally {
            System.out.println("Program akan selesai...");
        }
    }
}