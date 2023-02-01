package tarikfs.apipessoa.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import tarikfs.apipessoa.dto.PessoaDto;
import tarikfs.apipessoa.dto.PessoaSemEnderecoDto;
import tarikfs.apipessoa.dto.RegistraPessoaDto;
import tarikfs.apipessoa.model.Pessoa;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
public interface PessoaMapper {

    Pessoa toModelPessoa(PessoaDto pessoaDto);

    PessoaDto toDtoPessoa(Pessoa pessoa);

    List<PessoaDto> toDtoPessoaList(List<Pessoa> pessoas);

    List<Pessoa> toModelPessoaList(List<PessoaDto> pessoasDto);

    RegistraPessoaDto toDtoRegistraPessoa(Pessoa pessoa);

    Pessoa toModelRegistraPessoa(RegistraPessoaDto registraPessoaDto);

    Pessoa mapPutModelPessoa(RegistraPessoaDto registraPessoaDto, @MappingTarget Pessoa psessoa);

    List<PessoaSemEnderecoDto> toDtoPessoaSemEnderecoList(List<Pessoa> pessoas);

}
