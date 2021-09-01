package lk.ijse.pos.dao;

import lk.ijse.pos.dao.custom.OrderDAO;
import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.Orders;
import lk.ijse.pos.utils.CrudUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class OrderDAOImpl implements OrderDAO {

    public boolean addOrder(Orders orders) throws Exception {
        return CrudUtils.execute ( "INSERT INTO Orders VALUES (?,?,?)",orders.getId (),orders.getDate (),orders.getCustomerId ());
    }

    public boolean deleteOrder(){
        throw new UnsupportedOperationException ( "Error!" );
    }

    public boolean updateOrder(){
        throw new UnsupportedOperationException ( "Error!" );
    }

    public Orders searchOrder(){
        throw new UnsupportedOperationException ( "Error!" );
    }

    public ArrayList<Orders> getAllOrders(){
        return getAllOrders ();
    }

    @Override
    public boolean add(Orders orders) throws Exception {
        return CrudUtils.execute ( "INSERT INTO Orders VALUES (?,?,?)",orders.getId (),orders.getDate (),orders.getCustomerId ());
    }

    @Override
    public boolean update(Orders orders) throws Exception {
        throw new UnsupportedOperationException ( "Error!" );
    }

    @Override
    public boolean delete(String s) throws Exception {
        throw new UnsupportedOperationException ( "Error!" );
    }

    @Override
    public Orders search(String s) throws Exception {
        throw new UnsupportedOperationException ( "Error!" );
    }

    @Override
    public ArrayList<Orders> getAll() throws Exception {
        return getAll();
    }
}
