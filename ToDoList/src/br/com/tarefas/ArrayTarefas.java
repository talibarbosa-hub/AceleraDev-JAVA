package br.com.tarefas;

// Criando Array de Tarefas
public class ArrayTarefas {

    Tarefa[] tarefas;

    int contador = 0;

    public ArrayTarefas(int tamanho){ // construtor quando criar um array de tarefas terá que dizer o tamanho
        tarefas = new Tarefa[tamanho];
    }

    public void adicionar(Tarefa tarefa){ // tarefa do tipo Tarefa
    tarefas[contador] = tarefa;
    contador++;
    }
    public void removerTarefa(int posicao){
        tarefas[posicao]=null;
    }

    public void exibirTarefas() {
        for (Tarefa tarefa : tarefas) {         // executar uma vez para cada item do array
            tarefa.exibirTarefa() ;
        }
    }
}