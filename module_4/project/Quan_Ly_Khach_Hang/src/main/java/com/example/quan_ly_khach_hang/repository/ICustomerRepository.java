package com.example.quan_ly_khach_hang.repository;

import com.example.quan_ly_khach_hang.model.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}