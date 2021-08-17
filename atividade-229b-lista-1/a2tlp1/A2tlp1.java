package a2tlp1;

import java.util.Scanner;

public class A2tlp1 {
    public static void main(String[] args) {

        
        Scanner leia = new Scanner(System.in);
        Cadastro cad = new Cadastro(3);
        int op = 1;

        while (op != 0) {
            System.out.println("Menu");
            System.out.println("1 – Cadastrar atleta");
            System.out.println("2 - Remover o último atleta Cadastrado");
            System.out.println("3 - Buscar atleta pelo nome ");
            System.out.println("4-  Imprimir os atletas");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            op = Integer.parseInt(leia.nextLine());

            switch (op) {
                case 0:
                    System.out.println("Saindo!");
                    leia.close();
                    break;

                case 1: //add
                    System.out.print("Nome do atleta: ");
                    String nome = leia.nextLine();
                    System.out.print("Esporte praticado pelo atleta: ");
                    String esporte = leia.nextLine();
                    System.out.print("Nivel da pratica: ");
                    String nivel = leia.nextLine();
                    System.out.print("Idade do atleta: ");
                    int idade = Integer.parseInt(leia.nextLine());
                    
                    boolean saida = cad.add(new Atleta(nome, esporte, nivel, idade));
                            
                    if(saida){
                        System.out.println("Cadastro efetuado com sucesso!");
                    }else{
                        System.out.println("Cadastro não efetuado com sucesso!");
                    }
                    
                    break;

                case 2: //remove
                    saida = cad.remove();
                            
                    if(saida){
                        System.out.println("Remoção efetuada com sucesso!");
                    }else{
                        System.out.println("Remoção não efetuada com sucesso!");
                    }
                    break;

                case 3: //busca
                    System.out.print("Nome do atleta: ");
                    nome = leia.nextLine();
                    Atleta atl = cad.cotains(nome);
                    
                    if(atl == null){
                        System.out.println("Não existe!");
                    }else{
                        System.out.println(atl);
                    }
                    
                    break;

                case 4: //print
                    cad.print();
                    break;

                default:
                    System.out.println("Entrada inválida!");
                    break;
            }

        }
    }

}
