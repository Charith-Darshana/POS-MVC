package lk.ijse.pos.dao;

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

public class ItemDAOImpl implements ItemDAO{

    public boolean addItem(Item item) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement( "INSERT INTO Item VALUES (?,?,?,?)");

        pstm.setObject(1, item.getCode ());
        pstm.setObject(2, item.getDescription ());
        pstm.setObject(3, item.getQtyOnHand ());
        pstm.setObject(4, item.getUnitPrice ());
        return (pstm.executeUpdate ()>0);
    }

    @Override
    public boolean saveItem(Item item) throws Exception {
        return CrudUtils.execute ( "INSERT INTO Item VALUES (?,?,?,?)",item.getCode (),item.getDescription (),item.getUnitPrice (),item.getUnitPrice ());
    }

    public boolean updateItem(Item item) throws Exception {
        return CrudUtils.execute ("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?",item.getDescription (),item.getUnitPrice (),item.getQtyOnHand (),item.getCode ());
    }

    public boolean deleteItem(String code) throws Exception {
        return CrudUtils.execute ("DELETE FROM Item WHERE code=?",code);
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

    public Item searchItem(String code) throws Exception {
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
    public boolean updateItemQtyOnHand(String code, int qtyOnHand) throws Exception {
        return CrudUtils.execute ("UPDATE Item SET qtyOnHand=? WHERE code=?",qtyOnHand,code);
    }

    public ArrayList<Item> getAllItems() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();

        Statement stm = connection.createStatement();

        ResultSet rst = stm.executeQuery( "SELECT * FROM Item");

        ArrayList<Item> alItems = new ArrayList<>();

        while (rst.next()){
            Item item = new Item(rst.getString(1),
                    rst.getString(2),
                    rst.getBigDecimal(3),
                    rst.getInt(4));

            getAllItems().add(item);

        }
        return alItems;
    }

}
