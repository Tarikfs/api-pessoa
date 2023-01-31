package tarikfs.apipessoa.dto;

import java.sql.Date;

import tarikfs.apipessoa.model.Endereco;

public class PessoaDto {

    private Long id;
    private String nome;
    private Date DataNascimento;
    private Endereco endereco;

    public PessoaDto() {
    }

    public PessoaDto(Long id, String nome, Date dataNascimento, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.DataNascimento = dataNascimento;
        this.endereco = endereco;
    }

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

    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    

}
