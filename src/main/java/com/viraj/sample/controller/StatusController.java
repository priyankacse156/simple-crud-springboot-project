package com.viraj.sample.controller;
import com.viraj.sample.service.ServiceTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class StatusController {
    @Autowired
    private ServiceTime serviceTime;
 
    @GetMapping(path = "/status")
<<<<<<< HEAD
    public String getMessage() {
        return "Environment:B V2";
=======
    public String getServiceStartTime() {
        return serviceTime.getServiceStartTime();
>>>>>>> v1
    }
}

