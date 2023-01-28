package tarikfs.apipessoa.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import tarikfs.apipessoa.dto.PessoaDto;
import tarikfs.apipessoa.dto.PessoaSemEnderecoDto;
import tarikfs.apipessoa.dto.RegistraPessoaDto;
import tarikfs.apipessoa.model.Pessoa;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PessoaMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "enderecos", ignore = true)
    Pessoa toModelPessoa(PessoaDto pessoaDto);

    @Mapping(target = "endereco", ignore = true)
    PessoaDto toDtoPessoa(Pessoa pessoa);

    List<PessoaDto> toDtoPessoaList(List<Pessoa> pessoas);

    List<Pessoa> toModelPessoaList(List<PessoaDto> pessoasDto);

    @Mapping(target = "endereco", ignore = true)
    RegistraPessoaDto toDtoRegistraPessoa(Pessoa pessoa);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "enderecos", ignore = true)
    Pessoa toModelRegistraPessoa(RegistraPessoaDto registraPessoaDto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "enderecos", ignore = true)
    Pessoa mapPutModelPessoa(RegistraPessoaDto registraPessoaDto, @MappingTarget Pessoa psessoa);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "enderecos", ignore = true)
    Pessoa mapPatchModelPessoa(RegistraPessoaDto registraPessoaDto, @MappingTarget Pessoa pessoa);

    List<PessoaSemEnderecoDto> toDtoPessoaSemEnderecoList(List<Pessoa> pessoas);

}
