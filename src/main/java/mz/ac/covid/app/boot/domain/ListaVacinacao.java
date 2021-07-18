package mz.ac.covid.app.boot.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
}
