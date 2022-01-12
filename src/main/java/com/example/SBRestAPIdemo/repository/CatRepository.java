package com.example.SBRestAPIdemo.repository;


import com.example.SBRestAPIdemo.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<Cat, Integer> {

}