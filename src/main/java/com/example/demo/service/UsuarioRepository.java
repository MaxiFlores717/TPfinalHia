package com.example.demo.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, Long>{
	

}
