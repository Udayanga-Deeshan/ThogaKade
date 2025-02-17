package service;

import service.custom.impl.CustomerBOImpl;
import service.custom.impl.ItemBOImpl;
import util.BOType;

public class BOFactory {
    private static BOFactory instance;
    private BOFactory(){}

    public static BOFactory getInstance(){
        return instance == null ? instance = new BOFactory(): instance;
    }

    public <T extends  SuperService> T getBOType(BOType type){

        switch (type){
            case CUSTOMER : return (T) new CustomerBOImpl();
            case ITEM: return  (T) new ItemBOImpl();
            case ORDER:return  (T) new CustomerBOImpl();
        }
        return null;
    }


}
