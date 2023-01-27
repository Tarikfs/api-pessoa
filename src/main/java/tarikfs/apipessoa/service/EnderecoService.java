package tarikfs.apipessoa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import tarikfs.apipessoa.dto.EnderecoDto;
import tarikfs.apipessoa.mapper.EnderecoMapper;
import tarikfs.apipessoa.model.Endereco;
import tarikfs.apipessoa.repository.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    @Autowired
    EnderecoMapper enderecoMapper;

    @Transactional
    public EnderecoDto postEnderco(EnderecoDto enderecoDto) {
        Endereco endereco = enderecoMapper.toModelEndereco(enderecoDto);
        enderecoRepository.save(endereco);
        return enderecoMapper.toDtoEndereco(endereco);
    }

}
