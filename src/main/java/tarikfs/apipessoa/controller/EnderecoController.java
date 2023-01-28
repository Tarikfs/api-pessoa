package tarikfs.apipessoa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tarikfs.apipessoa.dto.RegistraEnderecoDto;
import tarikfs.apipessoa.service.EnderecoService;

@RequestMapping("/endereco")
@RestController
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<RegistraEnderecoDto> criarEndereco(@RequestBody RegistraEnderecoDto enderecoDto,
            @RequestParam Long id) {
        RegistraEnderecoDto registraEnderecoDto = enderecoService.CriarEndereco(enderecoDto, id);
        return ResponseEntity.status(HttpStatus.CREATED).body(registraEnderecoDto);
    }

}
