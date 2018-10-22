package Clientes;

import java.util.Scanner;

public class Pedidos extends Clientes implements Conta{
    private double valorConta;
    
    public Pedidos(String nome, String sexo, long cpf) {
        super(nome, sexo, cpf);
    }
    
    @Override
    public void imprimirConta(){
        System.out.println("Conta Imprimida");
    }
    
    @Override
    public void incluirPedido(Produtos produto){
        this.valorConta += produto.getValorUnidade();
        produto.removerQuantidade(1);
    }
    
    @Override
    public void cancelarPedido(Produtos produto){
        this.valorConta -= produto.getValorUnidade();
        produto.adicionarQuantidade(1);
    }
    
    @Override
    public boolean pagarConta(){
        System.out.println("Selecione a Forma de pagamento");
        System.out.println("1. Cartão credito/debito");
        System.out.println("2. Em dinheiro");
        int opcao = new Scanner(System.in).nextInt();
        switch(opcao){
            case 1:
                System.out.println("Insira o cartão");
                System.out.println("Pagamento realizado com êxito");
                break;
            case 2:
                System.out.println("Pagamento realizado com êxito");
                break;
            default:
                break;
        }
        return true;
    }
}
