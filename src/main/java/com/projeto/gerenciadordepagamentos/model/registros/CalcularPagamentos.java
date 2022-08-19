package com.projeto.gerenciadordepagamentos.model.registros;

import com.projeto.gerenciadordepagamentos.model.PagamentosModel;

import java.math.BigDecimal;

public interface CalcularPagamentos {
    public BigDecimal calcularPagamentos(PagamentosModel pagamentosModel);
}
