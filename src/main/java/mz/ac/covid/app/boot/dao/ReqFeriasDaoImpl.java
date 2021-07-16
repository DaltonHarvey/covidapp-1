package mz.ac.covid.app.boot.dao;

import org.springframework.stereotype.Repository;

import mz.ac.covid.app.boot.domain.ReqFerias;

@Repository
public class ReqFeriasDaoImpl extends AbstractDao<ReqFerias, Long> implements ReqFeriasDao {

    @Override
    public ReqFerias findbyId(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

}
