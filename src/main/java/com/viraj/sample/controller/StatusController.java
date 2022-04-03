package com.viraj.sample.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.viraj.sample.entity.ServiceTime;


@RestController
@RequestMapping("/")
public class StatusController {
    private ServiceTime serviceTime;
 
    @GetMapping(path = "/status")
    public String getServiceStartTime() {
        return serviceTime.getServiceStartTime();
    }
}

