package tarikfs.apipessoa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.transaction.Transactional;
import tarikfs.apipessoa.dto.PessoaDto;
import tarikfs.apipessoa.dto.RegistraPessoaDto;
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
    public RegistraPessoaDto createPessoa(RegistraPessoaDto registraPessoaDto) {
        Pessoa pessoa = pessoaMapper.toModelRegistraPessoa(registraPessoaDto);
        pessoaRepository.save(pessoa);
        return pessoaMapper.toDtoRegistraPessoa(pessoa);
    }

    public List<PessoaDto> listarPessoas() {
        List<Pessoa> pessoas = pessoaRepository.findAll();
        return pessoaMapper.toDtoPessoaList(pessoas);
    }

    public PessoaDto BuscarPessoaPorId(Long id) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        Pessoa pessoaModel = pessoa.orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
        return pessoaMapper.toDtoPessoa(pessoaModel);
    }

    @Transactional
    public RegistraPessoaDto atualizaPessoa(@PathVariable Long id,
            RegistraPessoaDto registraPessoaDto) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        Pessoa pessoaModel = pessoa.orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
        pessoaModel = pessoaMapper.mapPutModelPessoa(registraPessoaDto, pessoaModel);
        pessoaRepository.save(pessoaModel);
        return pessoaMapper.toDtoRegistraPessoa(pessoaModel);
    }
}
