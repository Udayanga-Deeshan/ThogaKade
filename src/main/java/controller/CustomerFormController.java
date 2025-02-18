package controller;

import com.google.inject.Inject;
import dto.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import service.BOFactory;
import service.SuperService;
import service.custom.CustomerBO;
import util.BOType;

public class CustomerFormController {

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colSalary;

    @FXML
    private TableView<?> tbCustomers;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSalary;
     @Inject
     CustomerBO service;

    @FXML
    void btnAddCustomerAction(ActionEvent event) {
        String id = txtID.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        Double salary = Double.parseDouble(txtSalary.getText());

        Customer customer = new Customer(id, name, address, salary);
        service.addCustomer(customer);


    }

    @FXML
    void btnDeleteCustomerAction(ActionEvent event) {

    }

    @FXML
    void btnReloadCustomersAction(ActionEvent event) {

    }

    @FXML
    void btnSearchCustomerAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateCustomerAction(ActionEvent event) {

    }

}
