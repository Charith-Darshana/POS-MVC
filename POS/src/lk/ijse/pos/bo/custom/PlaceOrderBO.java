package lk.ijse.pos.bo.custom;

import lk.ijse.pos.model.OrderDetails;
import lk.ijse.pos.model.Orders;

public interface PlaceOrderBO {
    public boolean purchaseOrder(Orders orders, ArrayList<OrderDetails> orderDetails ) throws Exception;
}