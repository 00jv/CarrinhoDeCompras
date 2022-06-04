package provapoo;

import java.util.Scanner;
import produtos.*;

public class ProvaPoo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int options = 0;
        Carrinho c = new Carrinho();
        Brinquedo b = new Brinquedo(12, "Brinquedo 1");
        Televisao e1 = new Televisao(52, "Televisão 1", 1);
        Televisao e2 = new Televisao(45, "Televisão 2", 2);
        Televisao e3 = new Televisao(35, "Televisão 3", 3);
        
        e1.setCusto(500);
        e2.setCusto(600);
        e3.setCusto(700);
        
        b.setCusto(50);
        
        do {
            System.out.println("----------------------MENU----------------");
            System.out.println("1 – Adicionar produto ao carrinho");
            System.out.println("2 – Remover produto do carrinho");
            System.out.println("3 – Visualizar carrinho de compras");
            System.out.println("4 – Finalizar a compra");
            System.out.println("5 – Cancelar compra");
            System.out.println("6 – Sair");
            System.out.println("-------------------------------------------");

            System.out.print("Qual Sua Opção: ");
            options = s.nextInt();
            switch (options) {

                case 1:
                    // int quantidade = 0;
                    //  int opc = 0;
                    //  String prod;
                    //  System.out.println("1- Brinquedos ");
                    //  System.out.println("2- Produtos");

                    //   System.out.print("Qual Sua Opção: ");
                    //   opc = s.nextInt();
                    //    System.out.println("");
                    //  System.out.print("Digite a quantidade: ");
                    //    quantidade = s.nextInt();
                    c.incluir(e1);
                    c.incluir(e2);
                    c.incluir(e3);
                    c.incluir(b);
                    break;

                case 2:
                     c.remover(e2.
                             ());
                    break;

                case 3:
                    c.exibirRelatorioPorNome();
                    System.out.println("\n");
                    c.exibirRelatorioPorValor();
                    System.out.println("\n");
                    break;

                case 4:
                    c.exibirRelatorioPorNome();
                    System.out.println("\n");
                    c.exibirRelatorioPorValor();
                    System.out.println("\n");
                    break;

                case 5:
                    c.exibirRelatorioPorNome();
                    System.out.println("\n");
                    c.exibirRelatorioPorValor();
                    System.out.println("\n");
                    break;

            }

        } while (options != 6);

    }

}
