package rodrigoservicecenter.controller;

import rodrigoservicecenter.model.CustomerModel;
import rodrigoservicecenter.model.entity.Customer;

import java.util.List;

public class CustomerController {

    public List<Customer> getAllCustomers(Customer customer){
        CustomerModel customerModel = new CustomerModel();
        return customerModel.getAllCustomers();
    }

    public Customer addCustomer(Customer customer){
        CustomerModel customerModel = new CustomerModel();
        return customerModel.addCustomer(customer);
    }

    public boolean updateCustomer(Customer customer){
        CustomerModel customerModel = new CustomerModel();
        return customerModel.updateCustomer(customer);
    }

    public boolean deleteCustomer(int id){
        CustomerModel customerModel = new CustomerModel();
        return customerModel.deleteCustomer(id);
    }

    public Customer getCustomerById(int id){
        CustomerModel customerModel = new CustomerModel();
        return customerModel.getCustomerById(id);
    }

    public List<Customer> searchCustomers(String keyword) {
        CustomerModel customerModel = new CustomerModel();
        return customerModel.searchCustomersByName(keyword);
    }

}
