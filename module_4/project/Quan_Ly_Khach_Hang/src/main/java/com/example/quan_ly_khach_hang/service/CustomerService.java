package com.example.quan_ly_khach_hang.service;
import com.example.quan_ly_khach_hang.model.Customer;
import com.example.quan_ly_khach_hang.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        return customerRepository.insertWithStoredProcedure(customer);
    }
}