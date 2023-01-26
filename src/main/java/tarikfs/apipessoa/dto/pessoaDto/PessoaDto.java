package tarikfs.apipessoa.dto.pessoaDto;

import java.sql.Date;

import tarikfs.apipessoa.model.Endereco;

public class PessoaDto {

    private String nome;
    private Date DataNascimento;
    Endereco endereco;

    public PessoaDto() {
    }

    public PessoaDto(String nome, Date dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.DataNascimento = dataNascimento;
        this.endereco = endereco;
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
