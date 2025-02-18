package service.custom.impl;

import dto.Customer;
import entity.CustomerEntity;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.matcher.StringMatcher;
import repository.DaoFactory;
import repository.custom.CustomerDao;
import service.custom.CustomerBO;
import util.DaoType;

public class CustomerBOImpl implements CustomerBO {

    CustomerDao dao = DaoFactory.getInstance().getDaoType(DaoType.CUSTOMER);

    @Override
    public boolean addCustomer(Customer customer) {
        System.out.println("Service "+ customer);
        CustomerEntity map = new  ModelMapper().map(customer, CustomerEntity.class);
        dao.save(map);
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return false;
    }
}
