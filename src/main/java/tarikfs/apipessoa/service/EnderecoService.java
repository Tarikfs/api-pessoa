package tarikfs.apipessoa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import tarikfs.apipessoa.dto.RegistraEnderecoDto;
import tarikfs.apipessoa.mapper.EnderecoMapper;
import tarikfs.apipessoa.model.Endereco;
import tarikfs.apipessoa.model.Pessoa;
import tarikfs.apipessoa.repository.EnderecoRepository;
import tarikfs.apipessoa.repository.PessoaRepository;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    @Autowired
    PessoaRepository pessoaRepository;

    @Autowired
    EnderecoMapper enderecoMapper;

    @Transactional
    public RegistraEnderecoDto CriarEndereco(RegistraEnderecoDto enderecoDto, Long id) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        Pessoa pessoaModel = pessoa.orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
        Endereco enderecoModel = enderecoMapper.toModelRegistraEndereco(enderecoDto);
        enderecoModel.setPessoa(pessoaModel);
        if (enderecoModel.isPrincipal()) {
            List<Endereco> enderecosDePessoa = pessoaModel.getEnderecos();
            for (Endereco endereco : enderecosDePessoa) {
                endereco.setPrincipal(false);
            }
            enderecoModel.setPrincipal(true);
        } else {
            enderecoModel.setPrincipal(false);
        }
        enderecoRepository.save(enderecoModel);
        return enderecoMapper.toDtoRegistraEndereco(enderecoModel);
    }

}
