import java.sql.*;

public class JsonToJava {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver ());
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "admin");

        // Object of statement class will help us to execute queries
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM CustomerInfo WHERE Location = 'Asia' and PurchaseDate = CURRENT_DATE();");
//
//        rs.next(); // setting the pointer to particular row
//
//        rs.getString(1);
//        rs.getString(2);
//        rs.getInt(3);
//        rs.getString(4);
//
//        rs.next();


        while(rs.next())
        {
            rs.getString(1);
            rs.getString(2);
            rs.getInt(3);
            rs.getString(4);
        }

        conn.close();
    }
}
