package br.com;

// import br.com.tarefas.ArrayTarefas;
import br.com.tarefas.ListaTarefas;
import br.com.tarefas.Tarefa;

class Principal {
    public static void main(String[] args){


        // ArrayTarefas tarefas = new ArrayTarefas(3);
        ListaTarefas tarefas = new ListaTarefas();

        //Tarefa tarefa1 = new Tarefa( "Regar as plantas" );
        //Tarefa tarefa2 = new Tarefa( "Estudar" );
        //Tarefa tarefa3 = new Tarefa( "Trabalhar" );

        tarefas.adicionar("Regar as plantas");
        tarefas.adicionar("Estudar");
        tarefas.adicionar("Trabalhar");

        System.out.println("Minhas Tarefas");
        System.out.println("********");
        //tarefas.buscar("Estudar");
       // Tarefa tarefa = tarefas.buscar("Estudar");
        //tarefa.exibirTarefa();
        tarefas.exibirTarefas();

        //tarefas.remover(2);
       // tarefas.remover(tarefa3);
       // System.out.println("Minhas tarefas após remover");
        //System.out.println("********");
        //tarefas.exibirTarefas();

        //System.out.println("A Tarefa tem " + tarefa1.obterTamanhoDaTarefa() + " caracteres");
    }

}


