package b10fundamental.com.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class JdbcMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/kampusb10";
		String username = "root";
		String password = "kodehive2020";

		// delete from .. where (select ..)
		// select * from (select * from tb where kelas = 7)
		// select * from tb where usia = (select avg(p.usia_mhs) from tb)

		Scanner scan = new Scanner(System.in);

		System.out.print("Input Id Mahasiswa : ");
		String id = scan.nextLine();

		System.out.print("Input Nama Mahasiswa : ");
		String nama = scan.nextLine();
		
		System.out.print("Spp : ");
		int spp = scan.nextInt();

		System.out.print("Input Alamat : ");
		String alamat = scan.nextLine();
		
		System.out.print("jurusanId : ");
		String jurusanId = scan.nextLine();

		Connection con = DriverManager.getConnection(url, username, password);

		String sql = "insert into mahasiswa (id, nm_mahasiswa, spp, alamat, jurusan_id) " + 
		"values (?,?,?,?,?)";

		PreparedStatement state = con.prepareStatement(sql);

		// set values
		state.setInt(1, Integer.valueOf(id));
		state.setString(2, nama);
		state.setInt(3, Integer.valueOf(spp));
		state.setString(4, alamat);
		state.setInt(5, Integer.valueOf(jurusanId));
		
		state.executeUpdate();
		
		System.out.println("Berhasil disimpan");
	}
}
