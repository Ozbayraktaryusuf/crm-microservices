package com.turkcell.crm.customerService.api.controllers;

import com.turkcell.crm.customerService.business.abstracts.CustomerService;
import com.turkcell.crm.customerService.business.dtos.requests.CreateCustomerRequest;
import com.turkcell.crm.customerService.business.dtos.requests.UpdateCustomerRequest;
import com.turkcell.crm.customerService.business.dtos.responses.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/customers")
public class CustomerController {
    private CustomerService customerService;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCustomerResponse add(@Valid @RequestBody CreateCustomerRequest createCustomerRequest){
        return this.customerService.add(createCustomerRequest);
    }
    @GetMapping("/getAll")
    public List<GetAllCustomerResponse> getAll(){
        return this.customerService.getAll();
    }
    @GetMapping("/getById/{id}")
    public GetByIdCustomerResponse getById(@PathVariable int id){
       return this.customerService.getById(id);
    }
    @PostMapping("/update/{id}")
    public UpdatedCustomerResponse update(@PathVariable int id, @Valid @RequestBody UpdateCustomerRequest updateCustomerRequest){
        return this.customerService.update(id,updateCustomerRequest);
    }
    @DeleteMapping("/delete/{id}")
    public DeleteCustomerResponse delete(@PathVariable int id){
        return this.customerService.delete(id);
    }
}
