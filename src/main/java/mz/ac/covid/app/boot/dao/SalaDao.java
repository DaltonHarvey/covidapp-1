package mz.ac.covid.app.boot.dao;

import mz.ac.covid.app.boot.domain.Sala;
import java.util.List;

public interface SalaDao {

    void save(Sala sala);

    void update(Sala sala);

    void delete(Long id);

    Sala findById(Long id);

    List<Sala> findAll();
}
