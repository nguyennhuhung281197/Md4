package com.example.quan_li_khach_hang.repository;

import com.example.quan_li_khach_hang.model.Customer;
import com.example.quan_li_khach_hang.model.Province;
import com.example.quan_li_khach_hang.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);

}



