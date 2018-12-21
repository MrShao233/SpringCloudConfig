package com.example.sericefeign.feign.service.info;

import com.example.sericefeign.feign.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @GetMapping(value = "/hi")
    public String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
