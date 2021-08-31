package lk.ijse.pos.dao;

import lk.ijse.pos.model.Item;

import java.util.ArrayList;

public interface ItemDAO {
    public boolean saveItem( Item item ) throws Exception;

    public boolean updateItem( Item item ) throws Exception;

    public boolean deleteItem( String code ) throws Exception;

    public ArrayList<Item> getAll() throws Exception;

    public Item searchItem(String code) throws Exception;

    public boolean updateItemQtyOnHand( String code,int qtyOnHand ) throws Exception;
}
