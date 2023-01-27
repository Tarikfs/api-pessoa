package tarikfs.apipessoa.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;

import tarikfs.apipessoa.dto.PessoaDto;
import tarikfs.apipessoa.model.Pessoa;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PessoaMapper {

    @Mapping(target = "id", ignore = true)
    Pessoa toModelPessoa(PessoaDto pessoaDto);

    PessoaDto toDtoPessoa(Pessoa pessoa);

    List<PessoaDto> toDtoPessoaList(List<Pessoa> pessoas);

}
