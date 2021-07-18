package mz.ac.covid.app.boot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import mz.ac.covid.app.boot.domain.Sala;
import mz.ac.covid.app.boot.service.SalaService;

@Component
public class StringToSalaConverter implements Converter<String, Sala> {

    @Autowired
    private SalaService service;

    @Override
    public Sala convert(String source) {
        if (source.isEmpty()) {
            return null;
        }

        Long id = Long.valueOf(source);
        return service.buscarPorId(id);
    }

}
