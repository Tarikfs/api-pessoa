package tarikfs.apipessoa.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 1, max = 50)
    @Column(name = "logradouro")
    private String logradouro;

    @Size(min = 8, max = 8)
    @Column(name = "cep")
    private int cep;

    @Size(min = 1, max = 50)
    @Column(name = "cidade")
    private String cidade;

    @Column(name = "numero")
    private int numero;

    public Endereco() {
    }

    public Endereco(@Size(min = 1, max = 50) String logradouro, @Size(min = 8, max = 8) int cep,
            @Size(min = 1, max = 50) String cidade, int numero) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.cidade = cidade;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
