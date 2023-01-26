package tarikfs.apipessoa.model;

import jakarta.persistence.Entity;

@Entity
public class Endereco {

    private String logradouro;
    private String cep;
    private String numero;
    private String cidade;
}
