package tarikfs.apipessoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tarikfs.apipessoa.dto.pessoaDto.PessoaDto;
import tarikfs.apipessoa.service.PessoaService;

@RequestMapping("/pessoa")
@RestController
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<PessoaDto> createPessoa(@RequestBody PessoaDto pessoaDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaService.createPessoa(pessoaDto));
    }

}
