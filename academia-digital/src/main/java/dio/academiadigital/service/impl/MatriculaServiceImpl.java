package dio.academiadigital.service.impl;

import dio.academiadigital.entity.Matricula;
import dio.academiadigital.entity.form.MatriculaForm;
import dio.academiadigital.repository.MatriculaRepository;
import dio.academiadigital.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
@Autowired
    private MatriculaRepository matriculaRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        return null;
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll(String bairro) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
