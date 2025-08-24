package io.github.dilluter.service;

import io.github.dilluter.model.Cliente;
import io.github.dilluter.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    public ClientesRepository repository;

@Autowired
    public ClienteService (ClientesRepository repository){
    this.repository = repository;
    }

    public void salvarCliente(Cliente cliente ){
    validarCliente(cliente);
        ClientesRepository clientesRepository = new ClientesRepository();
        ClientesRepository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente ){}
}