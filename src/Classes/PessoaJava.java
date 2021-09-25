package Classes;

// Exemplo de classe em Java
public class PessoaJava {
    private final String nome;
    private final int idade;

    public PessoaJava(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
