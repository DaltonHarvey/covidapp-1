package mz.ac.covid.app.boot.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@SuppressWarnings("serial")
@Entity
@Table(name = "LISTA_VACINACAO")
public class ListaVacinacao extends AbstractEntity<Long> {

    @ManyToOne
    @JoinColumn(name = "instituicao_id_fk")
    private Instituicao instituicao;

    @ManyToOne
    @JoinColumn(name = "funcionario_id_fk")
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "intituicao_sala_id_fk")
    private InstituicaoSala instituicaoSala;

    @DateTimeFormat(iso = ISO.DATE)
    @Column(name = "data_inicio", nullable = false, columnDefinition = "DATE")
    private Date data_inicio;

    @DateTimeFormat(iso = ISO.DATE)
    @Column(name = "data_termino", nullable = false, columnDefinition = "DATE")
    private Date data_termino;
}
