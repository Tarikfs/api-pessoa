package tarikfs.apipessoa.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import tarikfs.apipessoa.dto.EnderecoDto;
import tarikfs.apipessoa.model.Endereco;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface EnderecoMapper {

    Endereco toModelEndereco(EnderecoDto enderecoDto);

    EnderecoDto toDtoEndereco(Endereco endereco);

}
