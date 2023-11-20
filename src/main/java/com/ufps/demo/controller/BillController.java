/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufps.demo.controller;


import com.ufps.demo.model.Bill;
import com.ufps.demo.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/users/{user_id}/bills")
public class BillController {
    @Autowired
    BillRepository billRepo;

    @GetMapping
    public List<Bill> getBillAll() {
        return billRepo.findAll();
    }
    
    @GetMapping("/{id}")
    public Bill getBillsbyId(@PathVariable Integer id) {
        Optional<Bill> bill = billRepo.findById(id);

        if (bill.isPresent()) {
            return bill.get();
        }

        return null;
    }

    @PostMapping
    public User postUsers(@PathVariable String username,@PathVariable String pass,@RequestBody User user) {
        Optional<User> userCurrent = userRepo.findByUsername(username);
        if(userCurrent.isPresent()){
            User userReturn = userCurrent.get();
            if(userReturn.getPass().equals(pass)){
              return userReturn;}
        }
        return null;
    }
    

}
