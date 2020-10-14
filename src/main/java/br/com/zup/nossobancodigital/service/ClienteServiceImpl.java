package br.com.zup.nossobancodigital.service;

import br.com.zup.nossobancodigital.model.Cliente;
import br.com.zup.nossobancodigital.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolationException;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public Cliente save(Cliente cliente) {

        return clienteRepository.save(cliente);

    }

    @Override
    public Iterable<Cliente> listAll() {
        return null;
    }


}