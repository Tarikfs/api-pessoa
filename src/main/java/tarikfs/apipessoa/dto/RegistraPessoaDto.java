package tarikfs.apipessoa.dto;

import java.sql.Date;

public class RegistraPessoaDto {
    private String nome;
    private Date DataNascimento;

    public RegistraPessoaDto() {
    }

    public RegistraPessoaDto(String nome, Date dataNascimento) {
        this.nome = nome;
        DataNascimento = dataNascimento;
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

}
