# PBO08_24060124140131

Praktikum 8 - Generik

## Struktur Folder

- `src/Nomor_1` berisi keluarga kelas `Anabul`, `Kucing`, `Anggora`, dan `Kembangtelon`.
- `src/Nomor_2` berisi kelas generik `Datum<T>` dan aplikasinya.
- `src/Nomor_3` berisi `OperatorGenerik` dengan prosedur `Tukar` dan fungsi `Bobot2`.
- `src/Nomor_4` berisi kelas generik `Data<T>` berbasis larik 100 elemen dan aplikasinya.

## Compile

```bash
find src -name "*.java" -print0 | xargs -0 javac -d bin
```

## Run

```bash
java -cp bin Nomor_1.MainAnabul
java -cp bin Nomor_2.MainDatum
java -cp bin Nomor_3.MainOperatorGenerik
java -cp bin Nomor_4.MainData
```
