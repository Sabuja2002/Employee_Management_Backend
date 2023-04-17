package com.Project.SpringAngular.CustomerRepo;

import com.Project.SpringAngular.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
