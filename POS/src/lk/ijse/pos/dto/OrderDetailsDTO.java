package lk.ijse.pos.dto;

import java.math.BigDecimal;

public class OrderDetailsDTO {
    private String orderID;
    private String itemCode;
    private int qty;
    private BigDecimal unitPrice;

    public OrderDetailsDTO() {
    }

    public OrderDetailsDTO(String orderID, String itemCode, int qty, BigDecimal unitPrice) {
        this.orderID = orderID;
        this.itemCode = itemCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "OrderDetailsDTO{" +
                "orderID='" + orderID + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
