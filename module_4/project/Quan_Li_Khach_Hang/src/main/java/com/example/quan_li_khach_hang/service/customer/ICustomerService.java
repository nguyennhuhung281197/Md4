package com.example.quan_li_khach_hang.service.customer;

import com.example.quan_li_khach_hang.model.Customer;
import com.example.quan_li_khach_hang.model.Province;
import com.example.quan_li_khach_hang.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);

}