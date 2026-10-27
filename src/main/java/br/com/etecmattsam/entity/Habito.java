package br.com.etecmattsam.entity;

import jakarta.persistence.*;



@Entity
@Table(name = "TBL_HABITO")
public class Habito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hab")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "diasConsecutivos")
    private Integer diasConsecutivos;

    @Column(name = "metaDias")
    private Integer metas;

    @Column(name = "conquistaAlcancada")
    private boolean conquista;
}
