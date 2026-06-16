package br.edu.utfpr.cp.espjava.crudcidades.visao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<CidadeEntidade, Long> {

    /**
     * Por que Optional?
     * Porque não sabemos se a cidade existe!
     * O Optional nos permite fazer validações antes da exclusão.
     * 
     * @param nome
     * @param estado
     * @return
     */
    public Optional<CidadeEntidade> findByNomeAndEstado(String nome, String estado);

}
