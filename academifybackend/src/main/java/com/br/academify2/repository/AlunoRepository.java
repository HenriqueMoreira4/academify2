package com.br.academify2.repository;

import com.br.academify2.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    public Aluno findById(long id);


}
