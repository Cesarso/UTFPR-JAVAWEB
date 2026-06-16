package br.edu.utfpr.cp.espjava.crudcidades.visao;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public final class Cidade {
    @NotBlank(message = "O nome da cidade é obrigatório")
    @Size(min = 5, max = 60, message = "O nome da cidade deve conter entre 5 e 60 caracteres")
    private final String nome;

    @NotBlank(message = "O estado é obrigatório")
    @Size(min = 2, max = 2, message = "O estado deve conter exatamente 2 caracteres")
    private final String estado;

    public Cidade(final String nome, final String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }
}
