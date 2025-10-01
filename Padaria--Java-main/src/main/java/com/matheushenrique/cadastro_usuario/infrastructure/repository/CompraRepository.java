package com.matheushenrique.cadastro_usuario.infrastructure.repository;

import com.matheushenrique.cadastro_usuario.infrastructure.entitys.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraRepository  extends JpaRepository<Compra, Long> {
}
