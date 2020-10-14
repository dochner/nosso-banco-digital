package br.com.zup.nossobancodigital.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Cliente {


    public Cliente() {
        super();
    }

    public Cliente(@NotBlank(message = "Nome obrigatório!") String nome, @NotBlank(message = "Sobrenome obrigatório!") String sobrenome, @NotBlank(message = "Email obrigatório!") @Email String email, @NotNull(message = "Data de nascimento obrigatorio!")
            LocalDate dataNascimento,
                   String cpf) {
        this();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonFormat(pattern = "dd/MM/yyyy")
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
