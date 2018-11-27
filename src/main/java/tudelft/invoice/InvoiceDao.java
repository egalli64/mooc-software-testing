package tudelft.invoice;

import java.io.Closeable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InvoiceDao implements Closeable {

    private static Connection connection;

    public InvoiceDao() {
        try {
            if (connection != null)
                return;

            connection = DriverManager.getConnection("jdbc:hsqldb:file:mymemdb.db", "SA", "");
            connection.prepareStatement("create table invoice (name varchar(100), value double)").execute();
        } catch (SQLException e) {
            // throw new RuntimeException(e);
            System.out.println("Can't create table: " + e.getMessage());
        }
    }

    public List<Invoice> all() {

        List<Invoice> allInvoices = new ArrayList<>();

        try {
            PreparedStatement ps = connection.prepareStatement("select * from invoice");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                double value = rs.getDouble("value");
                allInvoices.add(new Invoice(name, value));
            }
        } catch (SQLException e) {
            // throw new RuntimeException(e);
            System.out.println("Can't select: " + e.getMessage());
        }

        return allInvoices;
    }

    public void save(Invoice inv) {
        try {
            PreparedStatement ps = connection.prepareStatement("insert into invoice (name, value) values (?,?)");
            ps.setString(1, inv.getCustomer());
            ps.setDouble(2, inv.getValue());

            ps.execute();

            connection.commit();
        } catch (SQLException e) {
            // throw new RuntimeException(e);
            System.out.println("Can't insert: " + e.getMessage());
        }
    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void dropInvoices() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection("jdbc:hsqldb:file:mymemdb.db", "SA", "");
                connection.prepareStatement("drop table invoice").execute();
            }
        } catch (SQLException e) {
            System.out.println("Can't drop table: " + e.getMessage());
        }
    }
}