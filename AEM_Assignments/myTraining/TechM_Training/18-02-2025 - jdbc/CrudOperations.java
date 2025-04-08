import java.sql.*;

public class Main {
    static String url = "jdbc:mysql://localhost:3306/datask";
    static String username = "root";
    //Give the password to access MySQL server
    static String password = "Sarathkumar@123";

    public static void main(String[] args) throws SQLException {
        selectRecords();
        selectColumnFromRecords();
        selectRecordsWithCondition();
        selectRecordsWithExternalParameters(1);
        selectRecordsWithPreparedStatement(1);
        insertRecord();
        insertRecordWithVariables(4,"soap eh",69, 100);
        insertRecordWithPreparedStatement(5,"seap eh", 30, 90);
        deleteRecord();
        deleteRecordWithVariables(4);
        deleteRecordWithPreparedStatement(5);
        updateRecord();
        updateRecordWithVariables(1, 2909);
        updateRecordWithPreparedStatement(1, 6000000);
    }


    public static void selectRecords() throws SQLException {
        String query = "select * from products";
        //Step 1 - connect database
        Connection connection = DriverManager.
                getConnection(url, username, password);
        //Step 2 - Creating statement
        Statement stmt = connection.createStatement();
        //Step 3 - Executing query and Processing resultset
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {

            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nName is:" + rs.getString(2));
            System.out.print("\nPrice is:" + rs.getDouble(3));
            System.out.print("\nQuantity is:" + rs.getInt(4));
        }
        //Step 4 - Close connection
        connection.close();
    }


    public static  void selectColumnFromRecords() throws SQLException {

        String query = "select id, product_name, price from products";
        //Step 1 - connect database
        Connection connection = DriverManager.
                getConnection(url,username, password);
        //Step 2 - Creating statement
        Statement stmt = connection.createStatement();
        //Step 3 - Executing query and Processing resultset
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()) {
            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nName is:" + rs.getString(2));
            System.out.print("\nPrice is:" + rs.getDouble(3));
        }
        //Step 4 - Close connection
        connection.close();
    }


    public static  void selectRecordsWithCondition() throws SQLException {

        String query = "select id, product_name, price from products where id=2;";
        //Step 1 - connect database
        Connection connection = DriverManager.
                getConnection(url,username, password);
        //Step 2 - Creating statement
        Statement stmt = connection.createStatement();
        //Step 3 - Executing query and Processing resultset
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()) {
            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nName is:" + rs.getString(2));
            System.out.print("\nPrice is:" + rs.getDouble(3));
        }
        //Step 4 - Close connection
        connection.close();
    }
    public static  void selectRecordsWithExternalParameters(int id) throws SQLException {

        // int eid = 24;
        // String query = "select emp_id, emp_name from employee " +
        //  "where emp_id=24";
        String query = "select id, product_name , price from products " +
                "where id="+id+";";
        //Step 1 - connect database
        Connection connection = DriverManager.
                getConnection(url,username, password);
        //Step 2 - Creating statement
        Statement stmt = connection.createStatement();
        //Step 3 - Executing query and Processing resultset
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()) {
            System.out.print("\nId is:" + rs.getString(1));
            System.out.print("\nName is:" + rs.getString(2));
            System.out.print("\nPrice is:" + rs.getInt(3));
        }
        //Step 4 - Close connection
        connection.close();
    }

    public static  void selectRecordsWithPreparedStatement(int id) throws SQLException {

        // int eid = 24;
        // String query = "select emp_id, emp_name from employee " +
        //  "where emp_id=24";
        //  String query = "select emp_id, emp_name from employee where emp_id=?";
        //Step 1 - connect database
        Connection connection = DriverManager.
                getConnection(url,username, password);
        //Step 2 - Creating statement
        PreparedStatement pstmt = connection.
                prepareStatement("select id, product_name from products where id=?");
        pstmt.setInt(1,id);
        ResultSet rs = pstmt.executeQuery();

        //Step 3 - Executing query and Processing resultset
        // ResultSet rs = pstmt.executeQuery(query);
        while(rs.next()) {
            System.out.print("\nId is:" + rs.getInt(1));
            System.out.print("\nName is:" + rs.getString(2));

        }
        //Step 4 - Close connection
        connection.close();
    }

    public static void insertRecord() throws SQLException {

        String query = "insert into products values(34, 'MCCA',7200,'20');";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        int row = st.executeUpdate(query);
        System.out.println("\nNumber of rows affected:"
                +row);
        connect.close();
    }
    public static void insertRecordWithVariables(int id, String  product_name, int price, int quantity) throws SQLException {

        //String query = "insert into employee values(15, 'ABR',720000);";
        String query = "insert into products values("+id+", '" + product_name+"',"+price+","+quantity+");";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        int row = st.executeUpdate(query);
        System.out.println("Number of rows affected:"
                +row);
        connect.close();
    }
    public static void insertRecordWithPreparedStatement(int id,
                                                         String  name, int salary, int quantity) throws SQLException {

        //String query = "insert into employee values(15, 'ABR',720000);";
        //String query = "insert into employee values("+id+", '" +
        //   name+"',"+salary+");";
        String query = "insert into products values(?,?,?,?);";
        Connection connect = DriverManager.
                getConnection(url, username, password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1, id);
        pst.setString(2, name);
        pst.setInt(3, salary);
        pst.setInt(4, quantity);
        System.out.println("Number of rows affected:"
                + pst.executeUpdate());
        connect.close();
    }

    public static void deleteRecord() throws SQLException {

        String query = "delete from products where id=34;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        System.out.println("Number of rows affected:"
                +st.executeUpdate(query));
        connect.close();
    }

    public static void deleteRecordWithVariables(int id) throws SQLException {

        // String query = "delete from employee where emp_id=11;";
        String query = "delete from products where id="
                +id+";";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        System.out.println("Number of rows affected:"
                +st.executeUpdate(query));
        connect.close();
    }
    public static void deleteRecordWithPreparedStatement(int id) throws SQLException {

        // String query = "delete from employee where emp_id=11;";
        // String query = "delete from employee where emp_id="
        // +id+";";
        String query = "delete from products where id=?;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,id);
        System.out.println("Number of rows affected:"
                +pst.executeUpdate());
        connect.close();
    }

    public static void updateRecord() throws SQLException {

        String query = "update products set price=800000 where id=1;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        System.out.println("Number of rows affected:"
                +st.executeUpdate(query));
        connect.close();
    }

    public static void updateRecordWithVariables(int id, int salary) throws SQLException {

        //String query = "update employee set salary=800000 where emp_id=15;";
        String query = "update products set price="+salary+" where " +
                "id="+id+";";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        Statement st = connect.createStatement();
        System.out.println("Number of rows affected:"
                +st.executeUpdate(query));
        connect.close();
    }


    public static void updateRecordWithPreparedStatement(int id, int salary) throws SQLException {

        //String query = "update employee set salary=800000 where emp_id=15;";
        //String query = "update employee set salary="+salary+" where " +
        // "emp_id="+id+";";
        String query = "update products set price=? where id=?;";
        Connection connect = DriverManager.
                getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,salary);
        pst.setInt(2,id);
        System.out.println("Number of rows affected:"
                +pst.executeUpdate());
        connect.close();
    }
}
