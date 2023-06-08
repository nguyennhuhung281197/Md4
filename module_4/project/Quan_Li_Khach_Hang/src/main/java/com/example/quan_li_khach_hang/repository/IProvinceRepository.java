package com.example.quan_li_khach_hang.repository;

import com.example.quan_li_khach_hang.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProvinceRepository extends PagingAndSortingRepository<Province, Long> {
}