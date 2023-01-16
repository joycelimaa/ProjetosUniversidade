package Projeto;

import java.util.Scanner;

public class BrincandoComArvores {
    public static void menuzin(){
        System.out.print("\n");
        System.out.print("\n#-- Menu Rotina de Treinos --#\n\n");
        System.out.print("|----------------------------|\n");
        System.out.print("| Op��o 1 - Procurar         |\n");
        System.out.print("| Op��o 2 - Inserir          |\n");
        System.out.print("| Op��o 3 - Deletar          |\n");
        System.out.print("| Op��o 4 - Sair             |\n");
        System.out.print("|----------------------------|\n");
        System.out.print("\nInforme uma op��o: ");
    }

    public static void main(String[] args) {
        ArvoreProjeto bt = new ArvoreProjeto();
        Scanner scanner  = new Scanner (System.in); 
        
        while (true) {
            menuzin();
            
            int opcao = scanner.nextInt();
            if (opcao == 4) {break;}
    

            switch (opcao) {
                case 1:
                    System.out.print("\nOp��o Procurar Treino Selecionada\n");
                    System.out.print("\nInforme o ID: ");
                    
                    int id = scanner.nextInt();
                    
                    if (bt.achou(id) == false){ System.out.print("\nN�o encontrado\n"); } 
                    else {bt.achou(id);}
                    
                    System.out.print("\n");
                    
                    break;

                case 2:
                    System.out.print("\nOp��o Inserir Treino Selecionada\n");
                    System.out.print("\nInforme o ID: ");
                    
                    int id2 = scanner.nextInt();
                    
                    {bt.insertIn(id2);}
                    
                    break;

                case 3:
                    System.out.print("\nOp��o Deletar Treino Selecionada\n");
                    System.out.print("\nInforme o ID: ");
                    
                    int id3 = scanner.nextInt();
                    
                    if (bt.achou(id3) == false){ System.out.print("\nN�o encontrado\n"); } 
                    else {bt.deleteThis(id3);}
                    
                    break;

                default:
                    System.out.print("\nOp��o Inv�lida!");
                    break;
            }
        }
    }
}
