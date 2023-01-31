package tarikfs.apipessoa.dto;

import java.sql.Date;
import java.util.List;

import tarikfs.apipessoa.model.Endereco;

public class RegistraPessoaDto {
    private String nome;
    private Date DataNascimento;
    private List<Endereco> enderecos;

    public RegistraPessoaDto() {
    }

    public RegistraPessoaDto(String nome, Date dataNascimento, List<Endereco> enderecos) {
        this.nome = nome;
        DataNascimento = dataNascimento;
        this.enderecos = enderecos;
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
