package br.com.tarefas;

import java.util.ArrayList;

public class ListaTarefas {
    ArrayList<Tarefa>tarefas = new ArrayList<>();   // array list de tarefas com o nome tarefas não precisa de construtor o arraylist vai se adaptar
    public void adicionar(Tarefa tarefa){
        if(tarefa !=null && tarefa.obterTamanhoDaTarefa() <= 20){
        this.tarefas.add(tarefa);
        } else {
            System.out.println("Digite até 20 caracteres para esta tarefa");
        }
    }

    public void adicionar(String descricao){
        Tarefa tarefa =new Tarefa(descricao);
        adicionar(tarefa);
    }

    public void remover(int posicao){
        if(posicao < this.tarefas.size()){
        this.tarefas.remove(posicao);
        } else{
            System.out.println("A tarefa não existe");
        }
    }

    public void remover(Tarefa tarefa){
        this.tarefas.remove(tarefa);
    }

    public Tarefa buscar(String descricao){
        for(Tarefa tarefa :tarefas) {
            if(descricao.equals(tarefa.descricao)){ // para objetos == ñ funciona pois ele compara a referencia da classe (posicao na memoria) não o conteudo
                return tarefa;
            }
        }
        System.out.println("tarefa não encontrada");
        return null;
    }

    public void exibirTarefas(){
        for(Tarefa tarefa: tarefas){
            tarefa.exibirTarefa();
        }
    }
}
