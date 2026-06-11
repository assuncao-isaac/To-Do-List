import Model.Tarefa;
import Util.AuxiliarTarefa;

import static Util.AuxiliarTarefa.*;

void main() {
        int escolha = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("===== TO DO LIST =====\n" + "\n" +
                    "1 - Criar tarefa\n" +
                    "2 - Listar tarefas\n" +
                    "3 - Concluir tarefa\n" +
                    "4 - Filtrar por prioridade\n" +
                    "5 - Filtrar por status\n" +
                    "6 - Excluir tarefa\n" +
                    "7 - Salvar\n" +
                    "0 - Sair \n");
            escolha = scanner.nextInt();
            switch (escolha){
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                case 1:
                    System.out.println("Entrando na criação de tarefa... \n");
                    if(criacaoTarefa(scanner)){
                        System.out.println("Tarefa criada com sucesso");
                    }
                    else{
                        System.out.println("ERRO");
                    }
                    break;
                case 2:
                    if (!imprimirTarefas()){
                        System.out.println("Lista vazia");
                    }
                    break;
                case 3:
                    if (!imprimirTarefas()){
                        System.out.println("Lista vazia");
                    }else{
                        if(!concluirTarefa(scanner)){
                            System.out.println("Por favor digite apenas números ao escolher a tarefa");
                        }
                    }
                    break;
                case 4:

                    break;
                case 5: break;
                case 6: break;
                case 7: break;
            }
        }while (escolha != 0);
        scanner.close();
}
