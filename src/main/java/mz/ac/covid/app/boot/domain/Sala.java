package mz.ac.covid.app.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "SALA")
public class Sala extends AbstractEntity<Long> {

    @Column(name = "nome", nullable = false, length = 60)
    private String nome;

    @Column(name = "lotacao")
    private Integer lotacao;

}
