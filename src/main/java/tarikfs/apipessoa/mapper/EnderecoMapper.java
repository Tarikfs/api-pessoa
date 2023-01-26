package tarikfs.apipessoa.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import tarikfs.apipessoa.dto.enderecoDto.EnderecoDto;
import tarikfs.apipessoa.model.Endereco;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface EnderecoMapper {

    Endereco toModelEndereco(EnderecoDto enderecoDto);

    EnderecoDto toDtoEndereco(Endereco endereco);
    

}
