package Clientes;

public interface Conta {
    public void imprimirConta();
    
    public void incluirPedido(Produtos produto);
    
    public void cancelarPedido(Produtos produto);
    
    public boolean pagarConta();
}
