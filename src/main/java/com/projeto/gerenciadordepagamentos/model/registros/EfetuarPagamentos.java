package com.projeto.gerenciadordepagamentos.model.registros;

public class EfetuarPagamentos {
    public  CalcularPagamentos calcularPagamentos(String opcaoPagamentos) {
        if (opcaoPagamentos.equalsIgnoreCase("Pagamento_Em_Atraso")) {
            return new EmAtraso();
        } else
            if (opcaoPagamentos.equalsIgnoreCase("Pagamento_Em_Dia")) {
return  new EmDia();
        }
            return  null;
    }
}
