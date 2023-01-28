package tarikfs.apipessoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tarikfs.apipessoa.dto.PessoaDto;
import tarikfs.apipessoa.dto.RegistraPessoaDto;
import tarikfs.apipessoa.service.PessoaService;

@RequestMapping("/pessoa")
@RestController
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<RegistraPessoaDto> createPessoa(@RequestBody RegistraPessoaDto registraPessoaDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.createPessoa(registraPessoaDto));
    }

    @GetMapping
    ResponseEntity<List<PessoaDto>> listarPessoas() {
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.listarPessoas());
    }

    @GetMapping("{id}")
    ResponseEntity<PessoaDto> buscarPessoaPorId() {
        return ResponseEntity.status(HttpStatus.OK).body(pessoaService.BuscarPessoaPorId());
    }

}
