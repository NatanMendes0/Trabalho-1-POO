public class Servico {
    private int codigo;
    private String nome;
    private double valor;

    // Construtor padrão
    public Servico() {
    }

    // Construtor com parâmetros para inicializar os atributos
    public Servico(int codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    // Retorna o código do serviço
    public int getCodigo() {
        return codigo;
    }

    // Define o código do serviço
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Retorna o nome do serviço
    public String getNome() {
        return nome;
    }

    // Define o nome do serviço
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna o valor do serviço
    public double getValor() {
        return valor;
    }

    // Define o valor do serviço
    public void setValor(double valor) {
        this.valor = valor;
    }

    // Retorna uma representação em String do objeto Servico
    @Override
    public String toString() {
        return "Servico{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}