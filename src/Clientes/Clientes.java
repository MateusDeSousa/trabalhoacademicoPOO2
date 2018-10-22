package Clientes;

public abstract class Clientes {
    private final String nome;
    private final String sexo;
    private final long cpf;

    public Clientes(String nome, String sexo, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
    }
    
    
}
