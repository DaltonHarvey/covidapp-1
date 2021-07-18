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

    public Instituicao getInstituicao() {
      return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
      this.instituicao = instituicao;
    }

    public Sala getSala() {
      return sala;
    }

    public void setSala(Sala sala) {
      this.sala = sala;
    }

    
}
