package com.example.CrudDemo.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Products")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Product {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;

   private String name;

   private String about;

   private double price;

   private int rate;
}
