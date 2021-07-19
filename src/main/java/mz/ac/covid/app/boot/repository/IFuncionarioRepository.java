package mz.ac.covid.app.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mz.ac.covid.app.boot.domain.Funcionario;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Long> {

    @Query(value = "SELECT \n" +
      "    it.nome AS instituicaoNome, s.nome salaNome, f.nome funcionarioNome\n" +
      "FROM\n" +
      "    instituicao_sala i\n" +
      "        INNER JOIN\n" +
      "    sala s ON (s.id = i.sala_id_fk)\n" +
      "        INNER JOIN\n" +
      "    instituicao it ON (it.id = i.instituicao_id_fk)\n" +
      "        INNER JOIN\n" +
      "    funcionarios f ON (f.instituicao_id_fk = it.id)\n" +
      "WHERE\n" +
      "    it.id =:Id", nativeQuery = true)
    public List<Funcionario> listaFuncionarios(@Param("Id") Long Id);
}
