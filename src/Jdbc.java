import java.sql.*;
public class Jdbc {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_tuto","root","manojkumar");
//            System.out.println("Connected!");
            Statement st = con.createStatement();
//            st.execute("create table employee (eno int, ename varchar(10), salary float(4))");
//            System.out.println("Table created!");
//            st.executeUpdate("insert into employee values(1, 'kumar', 12000)");
            st.executeUpdate("insert into employee values(2, 'manoj', 15000)");
            System.out.println("Values inserted");
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
