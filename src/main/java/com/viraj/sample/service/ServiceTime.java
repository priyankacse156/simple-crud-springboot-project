package com.viraj.sample.service;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Date;
import org.springframework.stereotype.Service;

@Service
public class ServiceTime {
    public String getServiceStartTime() {

        RuntimeMXBean runtimeBean = ManagementFactory.getRuntimeMXBean();
        long startTime = runtimeBean.getStartTime();
        Date startDate = new Date(startTime);

        System.out.println("\nStart Time in millisecond = " + startTime);
        System.out.println("Start Date = " + startDate);
        String message = "Environment A.  Start Time is :" + startDate;
         return message;
        // return "Hello";
    }
}