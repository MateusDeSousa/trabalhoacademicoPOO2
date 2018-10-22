package View;

import java.util.Scanner;

public class Menu {
    public static int MenuPrincipal(){
        System.out.println("---------------------------");
        System.out.println("       APP BOATE X");
        System.out.println("------Escolha uma opção----");
        System.out.println("1. Acessar Estoque");
        System.out.println("2. Acessar Caixa");
        System.out.println("3. Acessar Clientes");
        System.out.println("---------------------------");
        int opcaoEscolhida = new Scanner(System.in).nextInt();
        return opcaoEscolhida;
    }
    
    public static int MenuEstoque(){
        System.out.println("------>Estoque Boate<------");
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Alterar quantidade");
        System.out.println("3. Listar Produtos");
        int opcaoEscolhida = new Scanner(System.in).nextInt();
        return opcaoEscolhida;
    }
    
    public static int MenuCaixa(){
        System.out.println("------>Caixa Boate<------");
        System.out.println("1.Cadastrar Produto");
        System.out.println("2.Alterar quantidade");
        System.out.println("3. Listar Produtos");
        int opcaoEscolhida = new Scanner(System.in).nextInt();
        return opcaoEscolhida;
    }
    
    public static int MenuClientes(){
        System.out.println("------>Caixa Boate<------");
        System.out.println("1.Cadastrar Produto");
        System.out.println("2.Alterar quantidade");
        System.out.println("3. Listar Produtos");
        int opcaoEscolhida = new Scanner(System.in).nextInt();
        return opcaoEscolhida;
    }
}
