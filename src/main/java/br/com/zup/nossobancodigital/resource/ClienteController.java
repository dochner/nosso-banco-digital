package br.com.zup.nossobancodigital.resource;

import br.com.zup.nossobancodigital.model.Cliente;
import br.com.zup.nossobancodigital.service.ClienteService;
import br.com.zup.nossobancodigital.service.ClienteServiceImpl;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public String getCliente(){
        return "Hello World";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save(@Valid @RequestBody Cliente cliente){

        return clienteService.save(cliente);
    }

}
