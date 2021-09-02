package lk.ijse.pos.bo.custom;

import lk.ijse.pos.bo.custom.impl.CustomerBOImpl;
import lk.ijse.pos.bo.custom.impl.ItemBOImpl;
import lk.ijse.pos.bo.custom.impl.PlaceOrderBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){

    }
    public static BOFactory getInstance(){
        if ( boFactory==null ){
            boFactory = new BOFactory ();
            return boFactory;
        }
        return boFactory;
    }

    public enum BOType{
        CUSTOMER,ITEM,ORDER
    }

    public SuperBO getBO(BOType boType){
        switch (boType){
            case CUSTOMER:
                return (SuperBO) new CustomerBOImpl();
            case ITEM:
                return (SuperBO) new ItemBOImpl();
            case ORDER:
                return (SuperBO) new PlaceOrderBOImpl();
            default:
                return null;
        }
    }

}
