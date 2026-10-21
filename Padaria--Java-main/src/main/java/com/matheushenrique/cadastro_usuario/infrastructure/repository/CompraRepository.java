package com.matheushenrique.cadastro_usuario.infrastructure.repository;

import com.matheushenrique.cadastro_usuario.infrastructure.entitys.Compra;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompraRepository  extends JpaRepository<Compra, Long> {

    List<Compra> findByUsuarioCpf(String cpf);

    @Transactional
    void deleteByUsuarioCpf(String cpf);
}
