package com.example.quan_li_khach_hang.service.customer;
import com.example.quan_li_khach_hang.model.Customer;
import com.example.quan_li_khach_hang.model.Province;
import com.example.quan_li_khach_hang.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }
    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return customerRepository.findAllByProvince(province);
    }

}