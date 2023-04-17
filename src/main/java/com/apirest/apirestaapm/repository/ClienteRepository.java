package com.apirest.apirestaapm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.apirest.apirestaapm.model.Aluno;

@Repository
public interface ClienteRepository extends JpaRepository<Aluno, Long>{
    
}
