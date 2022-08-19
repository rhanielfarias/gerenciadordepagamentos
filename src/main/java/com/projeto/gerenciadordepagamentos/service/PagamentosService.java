package com.projeto.gerenciadordepagamentos.service;

import com.projeto.gerenciadordepagamentos.model.PagamentosModel;
import com.projeto.gerenciadordepagamentos.model.registros.EfetuarPagamentos;
import com.projeto.gerenciadordepagamentos.repository.PagamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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
        EfetuarPagamentos efetuarPagamentos = new EfetuarPagamentos();
        BigDecimal valor = efetuarPagamentos.calcularPagamentos(pagamentosModel.getStatus()).calcularPagamentos(pagamentosModel);

        pagamentosModel.getCodigo();
        pagamentosModel.getValorAPagar();
        pagamentosModel.getDiferenca();
pagamentosModel.setValorPago(valor);
        return pagamentosRepository.save(pagamentosModel);
    }

    public PagamentosModel alterar(PagamentosModel pagamentos) {
        EfetuarPagamentos efetuarPagamentos = new EfetuarPagamentos();
        BigDecimal valor = efetuarPagamentos.calcularPagamentos(pagamentos.getStatus()).calcularPagamentos(pagamentos);
        pagamentos.getCodigo();
        pagamentos.getValorAPagar();
        pagamentos.getDiferenca();
        pagamentos.setValorPago(valor);
        return pagamentosRepository.save(pagamentos);
    }

    public void deletar(Long      codigo) {
        pagamentosRepository.deleteById(codigo);
    }


    }
