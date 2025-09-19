import java.util.List;

public class OrdemDeServico {
    private int codigo;
    private Cliente cliente;
    private List<Servico> servicos;

    // Calcula o valor total dos serviços da ordem
    public double calculaValorTotal() {
        double total = 0;
        for (Servico servico : servicos) {
            total += servico.getValor();
        }
        return total;
    }

    // Verifica se existe um serviço com o código informado
    public boolean possuiServico(int codigo) {
        for (Servico servico : servicos) {
            if (servico.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    // Construtor padrão da classe
    public OrdemDeServico() {
    }

    // Construtor que inicializa todos os atributos
    public OrdemDeServico(int codigo, Cliente cliente, List<Servico> servicos) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.servicos = servicos;
    }

    // Retorna o código da ordem de serviço
    public int getCodigo() {
        return codigo;
    }

    // Define o código da ordem de serviço
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    // Retorna o cliente associado à ordem de serviço
    public Cliente getCliente() {
        return cliente;
    }

    // Define o cliente associado à ordem de serviço
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Retorna a lista de serviços da ordem
    public List<Servico> getServicos() {
        return servicos;
    }

    // Define a lista de serviços da ordem
    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    // Retorna uma representação em texto da ordem de serviço
    @Override
    public String toString() {
        return "OrdemDeServico{" +
                "codigo=" + codigo +
                ", cliente=" + cliente +
                ", servicos=" + servicos +
                '}';
    }
}
