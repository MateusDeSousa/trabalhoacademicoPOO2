package View;

import Clientes.*;

public class Principal{
    
    public static void main(String[] args) {
 
        //Criação de produtos
        Produtos wink = new Produtos();
        //int menuPrincipal = Menu.MenuPrincipal();
        switch(Menu.MenuPrincipal()){
            case 1:
                Menu.MenuEstoque();
                break;
            case 2:
                Menu.MenuCaixa();
                break;
            case 3:
                Menu.MenuClientes();
                break;
            default:
                System.out.println("Digite um numero valido");
                break;
        }
        System.out.println("");
        //Comida comida1 = new Comida("Salgado");
        //comida1.setQuantidade(200);
    }
}