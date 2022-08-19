package com.projeto.gerenciadordepagamentos.model;

import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "money")
public class PagamentosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(length = 50, nullable = false)
    private String status;
    @Column(length = 10, nullable = false)
    private BigDecimal valorAPagar;

    @Column(length = 10, nullable = false)
    private BigDecimal diferenca;


}