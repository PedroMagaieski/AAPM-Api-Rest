package com.apirest.apirestaapm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.apirest.apirestaapm.model.Aluno;
import com.apirest.apirestaapm.repository.ClienteRepository;


@RestController
@RequestMapping("/welcome")
public class firstController {
    
    private final ClienteRepository clienteRepository;
    @Autowired
    public firstController(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Aluno> first_Api(){
        return clienteRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno adicionar(@RequestBody Aluno aluno){
        return clienteRepository.save(aluno);
    }
}
