package service.custom;

import dto.Customer;
import service.SuperService;

public interface CustomerBO extends SuperService {

    boolean addCustomer(Customer customer);

    boolean updateCustomer(Customer customer);


}
