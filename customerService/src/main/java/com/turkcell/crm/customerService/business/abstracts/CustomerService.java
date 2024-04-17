package com.turkcell.crm.customerService.business.abstracts;

import com.turkcell.crm.customerService.business.dtos.requests.CreateCustomerRequest;
import com.turkcell.crm.customerService.business.dtos.requests.UpdateCustomerRequest;
import com.turkcell.crm.customerService.business.dtos.responses.*;

import java.util.List;

public interface CustomerService {
    CreateCustomerResponse add(CreateCustomerRequest request);
    List<GetAllCustomerResponse> getAll();
    GetByIdCustomerResponse getById(int id);
    UpdatedCustomerResponse update(int id,UpdateCustomerRequest updateCustomerRequest);
    DeleteCustomerResponse delete(int id);

}
