      package com.example.demo2.entity;

      import jakarta.persistence.*;
      import jakarta.persistence.criteria.CriteriaBuilder;

      import static jakarta.persistence.GenerationType.IDENTITY;

      @Entity
      @Table(name = "Book")
      public class Book {
          @Id
          @GeneratedValue(strategy = IDENTITY)
          @Column(name = "id" , unique = true, nullable = false)
          private Integer id;

          private String name;
          private String genre;


          public Integer getId() {
              return id;
          }

          public void setId(Integer id) {
              this.id = id;
          }

          public String getName() {
              return name;
          }

          public void setName(String name) {
              this.name = name;
          }

          public String getGenre() {
              return genre;
          }

          public void setGenre(String genre) {
              this.genre = genre;
          }
      }
