package lk.ijse.pos.dao;

import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.Customer;
import lk.ijse.pos.utils.CrudUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
        public boolean add(Customer customer) throws Exception {
            return CrudUtils.execute ( "INSERT INTO Customer VALUES (?,?,?,?)",
                    customer.getcID (),
                    customer.getName (),
                    customer.getAddress (),0);
    }

    @Override
    public boolean update(Customer customer) throws Exception {
        return CrudUtils.execute ( "UPDATE Customer SET name=?, address=? WHERE id=?",
                customer.getName (),
                customer.getAddress (),
                customer.getcID ());
    }

    @Override
    public boolean delete(String s) throws Exception {
        return CrudUtils.execute ( "DELETE FROM Customer WHERE id=?",id);
    }

    @Override
    public Customer search(String s) throws Exception {
        ResultSet resultSet = CrudUtils.execute ( "SELECT * FROM Customer where id=?",id );

        if (resultSet.next()) {
            return new Customer(resultSet.getString("id"), resultSet.getString("name"), resultSet.getString("address"));
        }
        return null;
    }

    @Override
    public ArrayList<Customer> getAll() throws Exception {
        ResultSet resultSet = CrudUtils.execute ( "SELECT * FROM Customer" );

        ArrayList<Customer> alCustomers = new ArrayList<>();
        while (resultSet.next()) {
            Customer customer = new Customer(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3));
            alCustomers.add(customer);
        }
        return alCustomers;
    }
}
