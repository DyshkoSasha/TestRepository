package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProvisionerRepositiory extends JpaRepository<ProvisionerEntity, UUID> {

    List<ProvisionerEntity> findAllById(UUID uuids);
    List<ProvisionerEntity> findAllByDealEntity(DealEntity entity);


}
