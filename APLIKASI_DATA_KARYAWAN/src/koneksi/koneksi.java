
package koneksi;

import java.sql.*;
import java.sql.Connection;

public class koneksi {
    private Connection koneksi;
    public Connection connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("koneksi berhasil");
        }catch(ClassNotFoundException ex){
            System.out.println("gagal koneksi" + ex);
        }
        String url = "jdbc:mysql://localhost/penjualan";
        try{
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("berhasil koneksi dengan database");
        }catch(SQLException ex){
            System.out.println("gagal koneksi database" + ex);
        }
        return koneksi;
    }
}
