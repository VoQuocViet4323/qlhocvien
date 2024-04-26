/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLHV;

import java.sql.*;

public class ketnoi {

    public static Connection KetnoiCSDL() throws SQLException {
        Connection kn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlhocvien", "root", "");
        return kn;
    }
}
