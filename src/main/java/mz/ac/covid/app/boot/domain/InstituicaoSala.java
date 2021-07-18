package mz.ac.covid.app.boot.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "INSTITUICAO_SALA")
public class InstituicaoSala extends AbstractEntity<Long> {

    @ManyToOne
    @JoinColumn(name = "instituicao_id_fk")
    private Instituicao instituicao;

    @ManyToOne
    @JoinColumn(name = "sala_id_fk")
    private Sala sala;
}
