package lk.ijse.pos.dao;

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

}
