package lk.ijse.pos.dao;

import lk.ijse.pos.dao.custom.ItemDAO;
import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.Item;
import lk.ijse.pos.utils.CrudUtils;
import lk.ijse.pos.view.tblmodel.ItemTM;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ItemDAOImpl implements ItemDAO {

    @Override
    public boolean add(Item item) throws Exception {
        return CrudUtils.execute ( "INSERT INTO Item VALUES (?,?,?,?)",item.getCode (),item.getDescription (),item.getUnitPrice (),item.getUnitPrice ());
    }

    @Override
    public boolean update(Item item) throws Exception {
        return CrudUtils.execute ("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?",item.getDescription (),item.getUnitPrice (),item.getQtyOnHand (),item.getCode ());
    }

    @Override
    public boolean delete(String s) throws Exception {
        return CrudUtils.execute ("DELETE FROM Item WHERE code=?",code);
    }

    @Override
    public Item search(String code) throws Exception {
        ResultSet resultSet = CrudUtils.execute ( "SELECT * FROM Item where code=?",code );

        if (resultSet.next()) {
            return new Item(resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getBigDecimal(3),
                    resultSet.getInt(4));
        }
        return null;
    }

    @Override
    public ArrayList<Item> getAll() throws Exception {
        ResultSet resultSet = CrudUtils.execute ( "SELECT * FROM Item" );
        ArrayList<Item> alItems = new ArrayList<>();
        while (resultSet.next()){
            Item item = new Item(resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getBigDecimal(3),
                    resultSet.getInt(4));
            alItems.add(item);
        }
        return alItems;

    }

    @Override
    public boolean updateItemQtyOnHand(String code, int qtyOnHand) throws Exception {
        return CrudUtils.execute ("UPDATE Item SET qtyOnHand=? WHERE code=?",qtyOnHand,code);
    }

}
