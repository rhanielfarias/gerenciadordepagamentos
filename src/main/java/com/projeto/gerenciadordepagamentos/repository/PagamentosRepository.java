package com.projeto.gerenciadordepagamentos.repository;

import com.projeto.gerenciadordepagamentos.model.PagamentosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentosRepository extends JpaRepository<PagamentosModel, Long> {
}
