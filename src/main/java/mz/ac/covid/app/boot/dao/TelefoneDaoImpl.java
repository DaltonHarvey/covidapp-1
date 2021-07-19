package mz.ac.covid.app.boot.dao;

import org.springframework.stereotype.Repository;

import mz.ac.covid.app.boot.domain.Telefone;

@Repository
public class TelefoneDaoImpl extends AbstractDao<Telefone, Long> implements TelefoneDao {}
