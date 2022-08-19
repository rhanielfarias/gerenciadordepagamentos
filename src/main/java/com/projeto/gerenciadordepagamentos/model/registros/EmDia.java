package com.projeto.gerenciadordepagamentos.model.registros;

import com.projeto.gerenciadordepagamentos.model.PagamentosModel;

import java.math.BigDecimal;

public class EmDia implements  CalcularPagamentos{
    @Override
    public BigDecimal calcularPagamentos(PagamentosModel pagamentosModel) {
        return  pagamentosModel.getValorAPagar();

    }
}
