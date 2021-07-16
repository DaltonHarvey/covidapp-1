package mz.ac.covid.app.boot.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import mz.ac.covid.app.boot.domain.NivelAcademico;
import mz.ac.covid.app.boot.service.NivelAcademicoService;

@Component
public class StringToNivelAcademicoConverter implements Converter<String, NivelAcademico> {

    @Autowired
    private NivelAcademicoService service;

    @Override
    public NivelAcademico convert(String source) {

        if (source.isEmpty()) {

            return null;
        }
        Long id = Long.valueOf(source);
        return service.buscarPorId(id);

    }

}
