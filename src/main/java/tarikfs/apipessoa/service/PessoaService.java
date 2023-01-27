package tarikfs.apipessoa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import tarikfs.apipessoa.dto.PessoaDto;
import tarikfs.apipessoa.mapper.PessoaMapper;
import tarikfs.apipessoa.model.Pessoa;
import tarikfs.apipessoa.repository.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    PessoaMapper pessoaMapper;

    @Autowired
    PessoaRepository pessoaRepository;

    @Transactional
    public PessoaDto createPessoa(PessoaDto pessoaDto) {
        Pessoa pessoa = pessoaMapper.toModelPessoa(pessoaDto);
        pessoaRepository.save(pessoa);
        return pessoaMapper.toDtoPessoa(pessoa);
    }

    public List<PessoaDto> listarPessoas() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        return pessoaMapper.toDtoPessoaList(pessoas);
    }
}
