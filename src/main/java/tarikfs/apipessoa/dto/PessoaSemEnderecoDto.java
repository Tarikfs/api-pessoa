package tarikfs.apipessoa.dto;

import java.sql.Date;

public class PessoaSemEnderecoDto {

    private Long id;
    private String nome;
    private Date DataNascimento;

    public PessoaSemEnderecoDto() {
    }

    public PessoaSemEnderecoDto(Long id, String nome, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        DataNascimento = dataNascimento;
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

}
