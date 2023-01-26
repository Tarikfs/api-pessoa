package tarikfs.apipessoa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import tarikfs.apipessoa.dto.pessoaDto.PessoaDto;
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
}
