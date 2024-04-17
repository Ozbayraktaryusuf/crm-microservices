package com.turkcell.crm.customerService.business.concretes;

import com.turkcell.crm.customerService.business.abstracts.CustomerService;
import com.turkcell.crm.customerService.business.dtos.requests.CreateCustomerRequest;
import com.turkcell.crm.customerService.business.dtos.requests.UpdateCustomerRequest;
import com.turkcell.crm.customerService.business.dtos.responses.*;
import com.turkcell.crm.customerService.core.utilities.mapping.ModelMapperService;
import com.turkcell.crm.customerService.dataAccess.abstracts.CustomerRepository;
import com.turkcell.crm.customerService.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {
    private CustomerRepository customerRepository;
    private ModelMapperService modelMapperService;
    @Override
    public CreateCustomerResponse add(CreateCustomerRequest request) {
        Customer customer=this.modelMapperService.forRequest().map(request,Customer.class);
        customer.setCreatedDate(LocalDateTime.now());
        Customer createdCustomer=this.customerRepository.save(customer);

        CreateCustomerResponse createCustomerResponse=this.modelMapperService.forResponse().map(createdCustomer,CreateCustomerResponse.class);
        return createCustomerResponse;
    }

    @Override
    public List<GetAllCustomerResponse> getAll() {
        List<GetAllCustomerResponse> getAllCustomerResponsesList=new ArrayList<>();
        List<Customer> customerList=this.customerRepository.findAll();
        for (Customer customer:customerList){
            GetAllCustomerResponse getAllCustomerResponse=this.modelMapperService.forResponse().map(customer, GetAllCustomerResponse.class);
            getAllCustomerResponsesList.add(getAllCustomerResponse);
        }
        return getAllCustomerResponsesList;
    }

    @Override
    public GetByIdCustomerResponse getById(int id) {
        GetByIdCustomerResponse getByIdCustomerResponse=this.modelMapperService.forResponse()
                .map(this.customerRepository.findById(id).get(), GetByIdCustomerResponse.class);
        return getByIdCustomerResponse;
    }

    @Override
    public UpdatedCustomerResponse update(int id, UpdateCustomerRequest updateCustomerRequest) {
        //Customer customer=this.customerRepository.findById(id).get();
        Customer customer=this.modelMapperService.forRequest().map(updateCustomerRequest,Customer.class);
        customer.setId(id);
        customer.setUpdatedDate(LocalDateTime.now());
        this.customerRepository.save(customer);

        UpdatedCustomerResponse updatedCustomerResponse=this.modelMapperService.forResponse().map(customer, UpdatedCustomerResponse.class);
        return updatedCustomerResponse;
    }

    @Override
    public DeleteCustomerResponse delete(int id) {
        Customer deletedCustomer=this.customerRepository.findById(id).get();
        deletedCustomer.setDeletedDate(LocalDateTime.now());
        this.customerRepository.save(deletedCustomer);
        DeleteCustomerResponse deleteCustomerResponse=this.modelMapperService.forResponse().map(deletedCustomer,DeleteCustomerResponse.class);
        return  deleteCustomerResponse;
    }
}
