package mz.ac.covid.app.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mz.ac.covid.app.boot.domain.Funcionario;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Long> {

    @Query(value = "SELECT ", nativeQuery = true)
    public String listaFuncionarios();
}
