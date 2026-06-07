/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc_service;

import jdbc_model.Mahasiswa;
import jdbc_utilities.MysqlUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author haritspermana
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;
    private ResultSet resultSet = null;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    /**
     * Membuat objek mahasiswa
     */
    public Mahasiswa makeMhsObject() {
        Mahasiswa mhs = null;

        try {
            int id = resultSet.getInt("id");
            String nama = resultSet.getString("nama");

            mhs = new Mahasiswa(id, nama);
        } catch (SQLException sqle) {
            System.out.println("Gagal membuat objek mahasiswa : " + sqle.getMessage());
        }

        return mhs;
    }

    /**
     * Menambahkan data mahasiswa
     */
    public void add(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";

        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());

            ps.executeUpdate();

            System.out.println("Berhasil insert");
        } catch (SQLException sqle) {
            System.out.println("Gagal insert : " + sqle.getMessage());
        }
    }

    /**
     * Update data mahasiswa
     */
    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";

        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());

            ps.executeUpdate();

            System.out.println("Berhasil update");
        } catch (SQLException sqle) {
            System.out.println("Gagal update : " + sqle.getMessage());
        }
    }

    /**
     * Delete data mahasiswa sesuai id
     */
    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";

        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Berhasil delete");
        } catch (SQLException sqle) {
            System.out.println("Gagal delete : " + sqle.getMessage());
        }
    }

    /**
     * Ambil mahasiswa sesuai id
     */
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;

        String sql = "SELECT * FROM mahasiswa WHERE id = ?";

        try (PreparedStatement ps = koneksi.prepareStatement(sql)) {
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                resultSet = rs;

                if (resultSet.next()) {
                    mhs = makeMhsObject();
                }
            }

        } catch (SQLException sqle) {
            System.out.println("Gagal mengambil data mahasiswa : " + sqle.getMessage());
        }

        return mhs;
    }

    /**
     * Ambil semua isi tabel mahasiswa
     */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listmhs = new ArrayList<>();

        String sql = "SELECT * FROM mahasiswa";

        try (PreparedStatement ps = koneksi.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            resultSet = rs;

            while (resultSet.next()) {
                Mahasiswa mhs = makeMhsObject();
                listmhs.add(mhs);
            }

        } catch (SQLException sqle) {
            System.out.println("Gagal mengambil semua data mahasiswa : " + sqle.getMessage());
        }

        return listmhs;
    }
}
