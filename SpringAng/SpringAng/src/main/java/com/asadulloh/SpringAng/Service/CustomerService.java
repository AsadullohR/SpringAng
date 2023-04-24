package com.asadulloh.SpringAng.Service;

import com.asadulloh.SpringAng.DTO.CustomerDTO;
import com.asadulloh.SpringAng.DTO.CustomerSaveDTO;
import com.asadulloh.SpringAng.DTO.CustomerUpdateDTO;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getAllCustomer();

    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

    boolean deleteCustomer(int id);
}