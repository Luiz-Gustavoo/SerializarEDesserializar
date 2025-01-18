package br.com.alura.serializardesserializar.Modelos;

public class Tarefas {
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;

    public String getDesricao() {
        return descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public void setPessoaResponsavel(String pessoaResponsavel) {
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public Tarefas(String descricao, boolean concluida, String pessoaResponsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }

    @Override
    public String toString() {
        return "Descrição: " + descricao + "\n"
                + "Concluída: " + concluida + "\n"
                + "Pessoa Responsável: " + pessoaResponsavel;
    }
}
