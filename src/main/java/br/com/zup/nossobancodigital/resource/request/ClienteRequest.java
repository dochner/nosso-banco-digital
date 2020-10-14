package br.com.zup.nossobancodigital.resource.request;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter @Setter
public class ClienteRequest {

    @NotBlank(message = "Nome obrigatório!")
    private String nome;

    @NotBlank(message = "Sobrenome obrigatório!")
    private String sobrenome;

    @NotBlank(message = "Email obrigatório!")
    @Email
    private String email;

    @NotNull(message = "Data de nascimento obrigatorio!")
    private LocalDate dataNascimento;

    @Column(unique = true)
    private String cpf;

}
