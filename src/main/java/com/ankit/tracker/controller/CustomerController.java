package com.ankit.tracker.controller;

import com.ankit.tracker.dao.ICustomerDAO;
import com.ankit.tracker.entity.Customer;
import com.ankit.tracker.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model model){
        List<Customer> customers = customerService.getCustomers();
        model.addAttribute("customers",customers);
        return "list-customer";
    }

    @GetMapping("showFormForAdd")
    public String showFormForAdd(Model model){
        Customer customer = new Customer();
        model.addAttribute("customer",customer);
        return "add-customer";
    }

    @PostMapping("saveCustomer")
    public String addCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect://customer/list";
    }

    @GetMapping("showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int id, Model model){
        Customer customer = customerService.getCustomer(id);
        model.addAttribute("customer",customer);
        return "add-customer";
    }

    @GetMapping("delete")
    public String deleteCustomer(@RequestParam("customerId") int id, Model model){
        customerService.deleteCustomer(id);
        return "redirect://customer/list";
    }
}
