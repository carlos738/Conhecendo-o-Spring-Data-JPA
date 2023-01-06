package dio.academiadigital.controller;

import dio.academiadigital.entity.Aluno;
import dio.academiadigital.entity.AvaliacaoFisica;
import dio.academiadigital.entity.form.AlunoForm;
import dio.academiadigital.service.impl.AlunoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/alunos")

public class AlunoController {
@Autowired
    private AlunoServiceImpl service;

@PostMapping
    public Aluno create(@Valid @RequestBody AlunoForm form){
    return  service.create(form);
}
@GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
    return service.getAllAvaliacaoFisicaId(id);
}
@GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento",required = false)
                              String dataDeNascimento){
    return service.getAll(dataDeNascimento);
}
}
