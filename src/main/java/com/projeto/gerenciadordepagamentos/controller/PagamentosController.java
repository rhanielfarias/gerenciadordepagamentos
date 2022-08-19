package com.projeto.gerenciadordepagamentos.controller;

import com.projeto.gerenciadordepagamentos.model.PagamentosModel;
import com.projeto.gerenciadordepagamentos.service.PagamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PagamentosController {
    @Autowired
    private PagamentosService pagamentosService;

    @GetMapping(path = "/pagamentos")
    public List<PagamentosModel> buscarTodosPagamentos() {
        return pagamentosService.buscarPagamentos();
    }

    @GetMapping(path = "/pagamentos/{codigo}")
    public Optional<PagamentosModel> buscarPorId(@PathVariable Long codigo) {
        return pagamentosService.buscarId(codigo);
    }

    @PostMapping(path = "/pagamentos")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentosModel cadastrarPagamentos(@RequestBody PagamentosModel pagamentosModel) {
        return pagamentosService.cadastrar(pagamentosModel);
    }

    @PutMapping(path = "/pagamentos/{codigo}")
    public PagamentosModel alterarPagamentos(@RequestBody PagamentosModel pagamentos) {
        return pagamentosService.alterar(pagamentos);
    }

    @DeleteMapping(path = "/pagamentos/{codigo}")
    public void deletarPagamentos(@PathVariable Long codigo) {
        pagamentosService.deletar(codigo);
    }

}