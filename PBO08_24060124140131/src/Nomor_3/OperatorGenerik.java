package Nomor_3;

// Nama File    : OperatorGenerik.java
// Deskripsi    : kelas yang berisi prosedur generik Tukar dan fungsi generik Bobot2.
// Pembuat      : Harits Permana / 24060124140131
// Tanggal      : 05/05/2026

import Nomor_1.Kucing;
import Nomor_2.Datum;

public class OperatorGenerik {
    public <T> void Tukar(Datum<T> data1, Datum<T> data2) {
        T temp = data1.getIsi();
        data1.setIsi(data2.getIsi());
        data2.setIsi(temp);
    }

    public <T extends Kucing, U extends Kucing> double Bobot2(T kucing1, U kucing2) {
        return kucing1.getBobot() + kucing2.getBobot();
    }
}
