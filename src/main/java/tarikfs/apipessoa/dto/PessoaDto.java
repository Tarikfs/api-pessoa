package tarikfs.apipessoa.dto;

import java.sql.Date;
import java.util.List;

import tarikfs.apipessoa.model.Endereco;

public class PessoaDto {

    private Long id;
    private String nome;
    private Date DataNascimento;
    private List<Endereco> enderecos;

    public PessoaDto() {
    }

    public PessoaDto(Long id, String nome, Date dataNascimento, List<Endereco> enderecos) {
        this.id = id;
        this.nome = nome;
        DataNascimento = dataNascimento;
        this.enderecos = enderecos;
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

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

}
