public class Cliente {
    private String cpf;
    private String nome;

    // Construtor padrão
    public Cliente() {
    }

    // Construtor que inicializa cpf e nome
    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    // Retorna o CPF do cliente
    public String getCpf() {
        return cpf;
    }

    // Define o CPF do cliente
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Retorna o nome do cliente
    public String getNome() {
        return nome;
    }

    // Define o nome do cliente
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna uma representação em string do cliente
    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
