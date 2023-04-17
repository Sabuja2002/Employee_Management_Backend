package com.Project.SpringAngular.Service;
import com.Project.SpringAngular.DTO.CustomerDTO;
import com.Project.SpringAngular.DTO.CustomerSaveDTO;
import com.Project.SpringAngular.DTO.CustomerUpdateDTO;

import java.util.List;

public interface CustomerService {
//    static String addCustomer(CustomerSaveDTO customerSaveDTO) {
//
//        return null;
//    }

    static String addCustomer(CustomerSaveDTO customerSaveDTO) {
        return null;
    }


    List<CustomerDTO> getAllCustomer();

    static String updateCustomers(CustomerUpdateDTO customerUpdateDTO) {
        return null;
    }

    boolean deleteCustomer(int id);
}
