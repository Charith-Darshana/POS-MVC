package dao;

import javafx.scene.input.InputMethodTextRun;
import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerDAOImpl {

    private InputMethodTextRun txtCustomerId;

    public boolean addCustomer(Customer customer) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();

        PreparedStatement pstm = connection.prepareStatement("INSERT INTO Customer VALUES (?,?,?,?)");

        pstm.setObject(1, txtCustomerId.getText());
        pstm.setObject(2, txtCustomerName.getText());
        pstm.setObject(3, txtCustomerAddress.getText());
        pstm.setObject(4, 0);
    }

    public boolean updateCustomer(Customer customer) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();

        PreparedStatement pstm = connection.prepareStatement("UPDATE Customer SET name=?, address=? WHERE id=?");
        pstm.setObject(1, txtCustomerName.getText());
        pstm.setObject(2, txtCustomerAddress.getText());
        pstm.setObject(3, txtCustomerId.getText());
    }

    public boolean deleteCustomer(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM Customer where id=?");
    }

    public boolean searchCustomer(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM Customer where id=?");
    }

    public ArrayList<Customer> getAllCustomers() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT * FROM Customer");
    }

}
