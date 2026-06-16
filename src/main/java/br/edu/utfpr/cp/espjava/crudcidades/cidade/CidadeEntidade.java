package br.edu.utfpr.cp.espjava.crudcidades.cidade;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GenerationType;

@Entity
public class CidadeEntidade implements java.io.Serializable {
    @Generated(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private final String estado;

    public CidadeEntidade() {
    }

    public CidadeEntidade clonar() {
        var cidadeEntidade = new CidadeEntidade();

        cidadeEntidade.setNome(this.nome);
        cidadeEntidade.setEstado(this.estado);
        return cidadeEntidade;

    }

    public Cidade clonar(CidadeEntidade cidadeEntidade) {
        var cidade = new Cidade(cidadeEntidade.getNome(), cidadeEntidade.getEstado());
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
