package com.matheushenrique.cadastro_usuario.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tb_compra")
@Entity

public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Produto repetido na lista = mais de uma unidade
    @ManyToMany
    @JoinTable(
           name = "tb_compra_produto",
           joinColumns = @JoinColumn(name = "compra_id"),
           inverseJoinColumns = @JoinColumn(name = "padaria_id")
    )
    private List<Padaria> produtos;

    @Column(name = "data_compra")
    private LocalDateTime dataCompra;

    @Column(name = "valor_total")
    private Double valorTotal;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "uf")
    private String uf;

    @Column(name = "forma_pagamento")
    private String formaPagamento;

}
