package lk.ijse.pos.bo.custom.impl;

import lk.ijse.pos.bo.custom.PlaceOrderBO;
import lk.ijse.pos.model.OrderDetails;
import lk.ijse.pos.model.Orders;

import java.util.ArrayList;

public class PlaceOrderBOImpl implements PlaceOrderBO {
    @Override
    public boolean purchaseOrder(Orders orders, ArrayList<OrderDetails> orderDetails) throws Exception {
        return false;
    }
}
