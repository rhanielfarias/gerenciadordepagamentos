package com.projeto.gerenciadordepagamentos.service;

import com.projeto.gerenciadordepagamentos.model.PagamentosModel;
import com.projeto.gerenciadordepagamentos.repository.PagamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentosService {
    @Autowired
private  PagamentosRepository pagamentosRepository;
    public  List<PagamentosModel> buscarPagamentos() {
        return pagamentosRepository.findAll();
    }
    public Optional<PagamentosModel> buscarId(Long codigo) {
        return pagamentosRepository.findById(codigo);
    }

    public PagamentosModel cadastrar(PagamentosModel pagamentosModel) {
        pagamentosModel.getCodigo();
        pagamentosModel.getStatus();
        pagamentosModel.getValorAPagar();
        pagamentosModel.getDiferenca();
        return pagamentosRepository.save(pagamentosModel);
    }

    public PagamentosModel alterar(PagamentosModel pagamentos) {
        pagamentos.getCodigo();
        pagamentos.getStatus();
        pagamentos.getValorAPagar();
        pagamentos.getDiferenca();
        return pagamentosRepository.save(pagamentos);
    }

    public void deletar(Long codigo) {
        pagamentosRepository.deleteById(codigo);
    }


    }
