package com.example.country_client.controller;

import com.example.country_server.entity.Country;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import lombok.AllArgsConstructor;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@AllArgsConstructor
public class CountryClientController {
    private DiscoveryClient discoveryClient;

    @GetMapping("/")
    public List<Country> handleRequest() {
        List<ServiceInstance> instances = discoveryClient.getInstances("Country-Service");
        if (instances != null && !instances.isEmpty()) {
            ServiceInstance serviceInstance = instances.get(0);
            String url = serviceInstance.getUri().toString();
            url = url + "/countries";
            RestTemplate restTemplate = new RestTemplate();
            return restTemplate.getForObject(url, List.class);
        }
     return null;
    }
}
