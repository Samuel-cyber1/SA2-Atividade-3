package com.AppRH.AppRH.repository;

import com.AppRH.AppRH.models.Empresa;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface EmpresaRepository extends CrudRepository<Empresa, Long> {
	Empresa findByEmpid(long empid);

	List<Empresa> findByNome(String nome);

	// Query para a busca
	@Query(value = "select u from Vaga u where u.nome like %?1%")
	List<Empresa> findByNomesEmpresa(String nome);
}
