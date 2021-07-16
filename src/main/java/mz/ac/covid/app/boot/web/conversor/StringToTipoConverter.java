package mz.ac.covid.app.boot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import mz.ac.covid.app.boot.domain.Tipo;
import mz.ac.covid.app.boot.service.TipoService;

@Component
public class StringToTipoConverter implements Converter<String, Tipo> {

    @Autowired
    private TipoService service;

    @Override
    public Tipo convert(String source) {
        if (source.isEmpty()) {

            return null;
        }
        Long id = Long.valueOf(source);
        return service.buscarPorId(id);
    }

}
