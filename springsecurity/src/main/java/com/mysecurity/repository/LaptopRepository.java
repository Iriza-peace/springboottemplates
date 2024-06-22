package com.mysecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mysecurity.entity.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
}