package tarikfs.apipessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tarikfs.apipessoa.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
