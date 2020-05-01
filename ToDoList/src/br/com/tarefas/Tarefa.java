package br.com.tarefas;

// Classe Tarefa
public class Tarefa {

    String descricao; // variavel global descricao do tipo String

    public Tarefa(String descricao){ // construtor da classe Tarefa variavel como parametro
        this.descricao = descricao;     // this. instancia a variavel global da classe e atribui o valor passado como parametro
    }

    public void exibirTarefa() {
        System.out.println(descricao);
    }

    public int obterTamanhoDaTarefa(){ // tipo de retorno
        return descricao.length(); // metodo que diz o tamanho da String
    }
}
