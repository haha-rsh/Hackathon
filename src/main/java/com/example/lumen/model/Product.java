package com.example.lumen.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;
    @JsonProperty("category")
    private String category;

    @JsonProperty("reorder_point")
    private int reorderPoint;

    @JsonProperty("stock_level")
    private int stockLevel;
    @JsonProperty("actions")
    private String actions;


     public void setId(Long id) {
         this.id = id;
     }
}
