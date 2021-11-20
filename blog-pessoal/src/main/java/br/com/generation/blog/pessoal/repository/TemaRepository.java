package br.com.generation.blog.pessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.generation.blog.pessoal.model.Tema;

	public interface TemaRepository extends JpaRepository<Tema, Long>{
		public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
	}



