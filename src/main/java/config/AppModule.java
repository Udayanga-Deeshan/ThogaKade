package config;

import com.google.inject.AbstractModule;
import repository.custom.CustomerDao;
import repository.custom.impl.CustomerDaoImpl;
import service.custom.CustomerBO;
import service.custom.impl.CustomerBOImpl;

public class AppModule extends AbstractModule {
    @Override
    protected void configure(){
        bind(CustomerBO.class).to(CustomerBOImpl.class);
        bind(CustomerDao.class).to(CustomerDaoImpl.class);
    }
}
