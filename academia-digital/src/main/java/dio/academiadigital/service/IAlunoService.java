package dio.academiadigital.service;

import dio.academiadigital.entity.Aluno;
import dio.academiadigital.entity.AvaliacaoFisica;
import dio.academiadigital.entity.form.AlunoForm;
import dio.academiadigital.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {
    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll(String dataDeNascimento);

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);

    abstract List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
