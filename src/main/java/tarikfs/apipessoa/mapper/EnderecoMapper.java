package tarikfs.apipessoa.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import tarikfs.apipessoa.dto.EnderecoDto;
import tarikfs.apipessoa.dto.RegistraEnderecoDto;
import tarikfs.apipessoa.model.Endereco;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface EnderecoMapper {

    Endereco toModelEndereco(EnderecoDto enderecoDto);

    @Mapping(target = "id", ignore = true)
    EnderecoDto toDtoEndereco(Endereco endereco);

    List<EnderecoDto> toDtoEnderecoList(List<Endereco> enderecos);

    List<Endereco> toModelEnderecoList(List<EnderecoDto> enderecosDto);

    RegistraEnderecoDto toDtoRegistraEndereco(Endereco endereco);

    Endereco toModelRegistraEndereco(RegistraEnderecoDto enderecoDto);

}
