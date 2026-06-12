import static Util.AuxiliarTarefa.*;

void main() {
        int escolha;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("""
                    ===== TO DO LIST =====
                    
                    1 - Criar tarefa
                    2 - Listar tarefas
                    3 - Concluir tarefa
                    4 - Filtrar por prioridade
                    5 - Filtrar por status
                    6 - Excluir tarefa
                    7 - Salvar
                    0 - Sair\s
                    """);
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
                    if (imprimirTarefas()){
                        System.out.println("Lista vazia");
                    }
                    break;
                case 3:
                    if (imprimirTarefas()){
                        System.out.println("Lista vazia");
                    }else{
                        if(!concluirTarefa(scanner)){
                            System.out.println("Por favor digite apenas números ao escolher a tarefa");
                        }
                    }
                    break;
                case 4:
                    if (!imprimirTarefasPrioridade(scanner)){
                        System.out.println("Lista vazia");
                    }
                    break;
                case 5:
                    if (!imprimirTarefasStatus(scanner)){
                        System.out.println("Lista vazia");
                    }
                    break;
                case 6:
                    if (imprimirTarefas()){
                        System.out.println("Lista vazia");
                    }else{
                        if(!excluirTarefa(scanner)){
                            System.out.println("Por favor digite apenas números ao escolher a tarefa");
                        }
                    }
                    break;
                case 7:
                    break;
            }
        }while (escolha != 0);
        scanner.close();
}
