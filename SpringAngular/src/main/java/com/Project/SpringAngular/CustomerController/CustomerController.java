package com.Project.SpringAngular.CustomerController;

import com.Project.SpringAngular.DTO.CustomerDTO;
import com.Project.SpringAngular.DTO.CustomerSaveDTO;
import com.Project.SpringAngular.DTO.CustomerUpdateDTO;
import com.Project.SpringAngular.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @PostMapping(path="/save")
    public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO){
        String id;
        id = CustomerService.addCustomer(customerSaveDTO);
        return id;
    }
    @GetMapping(path = "/getAllCustomer")
    public List<CustomerDTO> getAllCustomer(){
        List<CustomerDTO>allCustomers=customerService.getAllCustomer();
        return allCustomers;
    }

    @PutMapping(path="/update")
    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO){
        String id = CustomerService.updateCustomers(customerUpdateDTO);
        return id;

    }
    @DeleteMapping(path = "/deletecustomer/{id}")
    public String deleteCustomer(@PathVariable(value = "id") int id)
    {
        boolean deletecustomer = customerService.deleteCustomer(id);
        return "deleted";
    }

}
