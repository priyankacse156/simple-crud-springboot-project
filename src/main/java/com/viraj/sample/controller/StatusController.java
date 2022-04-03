package com.viraj.sample.controller;
import com.viraj.sample.entity.Employee;
import com.viraj.sample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StatusController {
 
    @GetMapping(path = "/status")
    public String getMessage() {
        return "Environment:B V2";
    }
}

