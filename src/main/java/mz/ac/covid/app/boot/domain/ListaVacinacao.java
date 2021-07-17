package mz.ac.covid.app.boot.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

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

  @OneToMany(mappedBy = "departamento")
  private List<Funcionario> funcionarios;
  // @ManyToOne
  // @JoinColumn(name = "intituicao_sala_id_fk")
  // private InstituicaoSala instituicaoSala;

  @ManyToOne
  @JoinColumn(name = "sala_id_fk")
  private Sala sala;

  @DateTimeFormat(iso = ISO.DATE)
  @Column(name = "data_inicio", nullable = false, columnDefinition = "DATE")
  private Date data_inicio;

  @DateTimeFormat(iso = ISO.DATE)
  @Column(name = "data_termino", nullable = false, columnDefinition = "DATE")
  private Date data_termino;

  // @Transient
  // private Sala sala;

  public Instituicao getInstituicao() {
    return instituicao;
  }

  public void setInstituicao(Instituicao instituicao) {
    this.instituicao = instituicao;
  }

  public Funcionario getFuncionario() {
    return funcionario;
  }

  public void setFuncionario(Funcionario funcionario) {
    this.funcionario = funcionario;
  }

  // public InstituicaoSala getInstituicaoSala() {
  // return instituicaoSala;
  // }

  // public void setInstituicaoSala(InstituicaoSala instituicaoSala) {
  // this.instituicaoSala = instituicaoSala;
  // }

  public Date getData_inicio() {
    return data_inicio;
  }

  public void setData_inicio(Date data_inicio) {
    this.data_inicio = data_inicio;
  }

  public Date getData_termino() {
    return data_termino;
  }

  public void setData_termino(Date data_termino) {
    this.data_termino = data_termino;
  }

  public Sala getSala() {
    return sala;
  }

  public void setSala(Sala sala) {
    this.sala = sala;
  }

  // public Sala getSala() {
  // return sala;
  // }

  // public void setSala(Sala sala) {
  // this.sala = sala;
  // }

}
