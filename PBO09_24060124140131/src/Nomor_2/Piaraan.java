// Nama File    : Piaraan.java
// Deskripsi    : kelas untuk mengelola antrean objek Anabul pada klinik pemeliharaan hewan.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 07/05/2026

package Nomor_2;

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        this.nbelm = 0;
        this.Lanabul = new LinkedList<Anabul>();
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm = Lanabul.size();
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul anabul = Lanabul.poll();
        nbelm = Lanabul.size();
        return anabul;
    }

    public void showAnabul() {
        if (Lanabul.isEmpty()) {
            System.out.println("Antrean anabul kosong.");
            return;
        }

        for (Anabul anabul : Lanabul) {
            System.out.println(anabul.getNama());
        }
    }

    public int countKucing() {
        int jumlah = 0;

        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public double bobotKucing() {
        double totalBobot = 0;

        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                totalBobot += ((Kucing) anabul).getBobot();
            }
        }

        return totalBobot;
    }

    public void showJenisAnabul() {
        if (Lanabul.isEmpty()) {
            System.out.println("Antrean anabul kosong.");
            return;
        }

        for (Anabul anabul : Lanabul) {
            System.out.println(anabul.getNama() + " - " + anabul.getClass().getName());
        }
    }
}
