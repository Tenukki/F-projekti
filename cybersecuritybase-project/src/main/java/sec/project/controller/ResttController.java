/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sec.project.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sec.project.domain.Signup;
import sec.project.repository.SignupRepository;

/**
 *
 * @author Santeri
 */

@RestController
public class ResttController {
    
    @Autowired
    private SignupRepository signupRepository;
    
    @GetMapping("/event")
    public List<Signup> getUsers() {
        return signupRepository.findAll();
    }
}
