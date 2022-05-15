package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class Controller {

   private final ProvisionerRepositiory provisionerRepositiory;


    @GetMapping("/1")
    private List<ProvisionerEntity> getById(@RequestParam UUID uuid) {
        List<ProvisionerEntity> allById = provisionerRepositiory.findAllById(uuid);
        return allById;
    }

    @GetMapping("/2")
    private List<ProvisionerEntity> getByDealId(@RequestBody DealEntity entity) {
        List<ProvisionerEntity> allById = provisionerRepositiory.findAllByDealEntity(entity);
        return allById;
    }


}
