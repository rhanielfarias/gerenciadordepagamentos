package com.projeto.gerenciadordepagamentos.model.registros;

import com.projeto.gerenciadordepagamentos.model.PagamentosModel;

import java.math.BigDecimal;

public class EmAtraso implements  CalcularPagamentos{
    @Override
    public BigDecimal calcularPagamentos(PagamentosModel pagamentosModel){
        return  pagamentosModel.getValorAPagar().add(pagamentosModel.getDiferenca());
    }
}
