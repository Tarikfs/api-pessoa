package tarikfs.apipessoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import tarikfs.apipessoa.dto.PessoaDto;
import tarikfs.apipessoa.dto.PessoaSemEnderecoDto;
import tarikfs.apipessoa.dto.RegistraPessoaDto;
import tarikfs.apipessoa.service.PessoaService;

@RequestMapping("/pessoa")
@RestController
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<RegistraPessoaDto> criarPessoa(@RequestBody RegistraPessoaDto registraPessoaDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.criarPessoa(registraPessoaDto));
    }

    @GetMapping
    ResponseEntity<List<PessoaSemEnderecoDto>> listarPessoas() {
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.listarPessoas());
    }

    @GetMapping("/{id}/enderecos")
    ResponseEntity<PessoaDto> buscarPessoaPorIdComEndereco(@PathVariable Long id) {
        PessoaDto pessoaDto = pessoaService.BuscarPessoaPorIdComEndereco(id);
        return ResponseEntity.status(HttpStatus.OK).body(pessoaDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RegistraPessoaDto> atualizarPessoa(@PathVariable Long id,
            @Valid @RequestBody RegistraPessoaDto registraPessoaDto) {
        RegistraPessoaDto pessoaDto = pessoaService.atualizaPessoa(id, registraPessoaDto);
        return ResponseEntity.status(HttpStatus.OK).body(pessoaDto);
    }

}
