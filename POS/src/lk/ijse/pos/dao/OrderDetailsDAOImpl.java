package lk.ijse.pos.dao;

import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.OrderDetails;
import lk.ijse.pos.utils.CrudUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OrderDetailsDAOImpl implements OrderDetailsDAO{
    @Override
    public boolean addOrderDetails(OrderDetails orderDetails) throws Exception {
        return CrudUtils.execute ( "INSERT INTO OrderDetail VALUES (?,?,?,?)" ,orderDetails.getOrderId (),orderDetails.getItemCode (),orderDetails.getQty (),orderDetails.getUnitPrice ());
    }
}
