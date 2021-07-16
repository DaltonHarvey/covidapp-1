package mz.ac.covid.app.boot.dao;

import org.springframework.stereotype.Repository;

import mz.ac.covid.app.boot.domain.Endereco;

@Repository
public class EnderecoDaoImpl extends AbstractDao<Endereco, Long> implements EnderecoDao {

    @Override
    public Endereco findbyId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

}
