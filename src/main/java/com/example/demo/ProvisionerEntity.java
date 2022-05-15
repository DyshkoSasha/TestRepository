package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AAA")
public class ProvisionerEntity {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "deal_id", insertable = false, updatable = false)
    private DealEntity dealEntity;
}

