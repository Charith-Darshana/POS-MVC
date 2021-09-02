package lk.ijse.pos.dao.custom;

import lk.ijse.pos.dao.CrudDAO;
import lk.ijse.pos.dao.SuperDAO;
import lk.ijse.pos.model.Item;

public interface ItemDAO extends CrudDAO< Item,String>  {

    boolean updateItemQtyOnHand( String code,int qtyOnHand ) throws Exception;

}
