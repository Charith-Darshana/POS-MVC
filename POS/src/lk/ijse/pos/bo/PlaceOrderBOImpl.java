package lk.ijse.pos.bo;

import lk.ijse.pos.dao.CustomerDAOImpl;
import lk.ijse.pos.dao.ItemDAOImpl;
import lk.ijse.pos.dao.OrderDAOImpl;
import lk.ijse.pos.dao.OrderDetailsDAOImpl;
import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.dao.custom.ItemDAO;
import lk.ijse.pos.dao.custom.OrderDAO;
import lk.ijse.pos.dao.custom.OrderDetailsDAO;
import lk.ijse.pos.model.Orders;

import java.util.ArrayList;

public class PlaceOrderBOImpl {
    private CustomerDAO customerDAO = new CustomerDAOImpl( );

    private ItemDAO itemDAO = new ItemDAOImpl( );

    private OrderDAO orderDAO = new OrderDAOImpl( );

    private OrderDetailsDAO orderDetailsDAO =  new OrderDetailsDAOImpl( );

    public boolean purchaseOrder(Orders orders, ArrayList<OrderDetailsDAO> orderDetails ) throws Exception {
        boolean add = orderDAO.add ( orders );
        return false;
    }
}
