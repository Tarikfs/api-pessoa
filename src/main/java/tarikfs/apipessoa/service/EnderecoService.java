package tarikfs.apipessoa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tarikfs.apipessoa.dto.enderecoDto.EnderecoDto;
import tarikfs.apipessoa.mapper.EnderecoMapper;
import tarikfs.apipessoa.model.Endereco;
import tarikfs.apipessoa.repository.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    @Autowired
    EnderecoMapper enderecoMapper;

    public EnderecoDto postEnderco(EnderecoDto enderecoDto) {
        Endereco endereco = enderecoMapper.toModelEndereco(enderecoDto);
        enderecoRepository.save(endereco);
        return enderecoMapper.toDtoEndereco(endereco);
    }

}
