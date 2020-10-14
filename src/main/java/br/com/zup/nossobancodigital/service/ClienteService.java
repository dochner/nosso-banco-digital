package br.com.zup.nossobancodigital.service;

import br.com.zup.nossobancodigital.model.Cliente;

import java.util.ArrayList;

public interface ClienteService {

    public Cliente save(Cliente cliente);

    public Iterable<Cliente> listAll();

}
