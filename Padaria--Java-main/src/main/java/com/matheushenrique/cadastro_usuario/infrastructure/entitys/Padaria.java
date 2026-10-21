package com.matheushenrique.cadastro_usuario.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
@Table(name = "padaria")

public class Padaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco")
    private Double preco;

    @Column(name = "descricao")
    private String descricao;

    // paes, doces, salgados ou bebidas (usado no filtro da página de produtos)
    @Column(name = "categoria")
    private String categoria;

    // caminho da imagem dentro de /static (ex: img/Sonho.jpg)
    @Column(name = "imagem")
    private String imagem;

}
