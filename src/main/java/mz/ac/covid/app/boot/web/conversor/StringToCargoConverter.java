package mz.ac.covid.app.boot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import mz.ac.covid.app.boot.domain.Instituicao;
import mz.ac.covid.app.boot.service.InstituicaoService;

@Component
public class StringToCargoConverter implements Converter<String, Instituicao> {

    @Autowired
    private InstituicaoService service;

    @Override
    public Instituicao convert(String source) {
        if (source.isEmpty()) {

            return null;
        }
        Long id = Long.valueOf(source);
        return service.pesquisarPorId(id);
    }

}
