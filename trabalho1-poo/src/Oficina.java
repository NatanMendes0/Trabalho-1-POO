import java.util.List;
import java.util.ArrayList;

public class Oficina {
    private List<OrdemDeServico> ordensServicos = new ArrayList<>();

    // Adiciona uma ordem de serviço à lista
    public void adicionaOS(OrdemDeServico os) {
        ordensServicos.add(os);
    }

    // Busca uma ordem de serviço pelo código
    // se não encontrar, retorna null
    public OrdemDeServico buscaOSCodigo(int codigo) {
        for (OrdemDeServico os : ordensServicos) {
            if (os.getCodigo() == codigo) {
                return os;
            }
        }
        return null;
    }

    // Busca uma ordem de serviço pelo CPF do cliente
    // se não encontrar, retorna null
    public OrdemDeServico buscaOSCPF(String cpf) {
        for (OrdemDeServico os : ordensServicos) {
            if (os.getCliente().getCpf().equals(cpf)) {
                return os;
            }
        }
        return null;
    }

    // Busca uma ordem de serviço pelo código do serviço
    // se não encontrar, retorna null
    public OrdemDeServico buscaOSServico(int codigoServico) {
        for (OrdemDeServico os : ordensServicos) {
            if (os.possuiServico(codigoServico)) {
                return os;
            }
        }
        return null;
    }

    // Calcula o faturamento total de todas as ordens de serviço
    // se não encontrar, retorna 0
    public double calculaFaturamentoTotal() {
        double total = 0;
        for (OrdemDeServico os : ordensServicos) {
            total += os.calculaValorTotal();
        }
        return total;
    }

    // Construtor padrão que inicializa a lista de ordens de serviço
    public Oficina() {
        this.ordensServicos = new ArrayList<>();
    }

    // Construtor que recebe uma lista de ordens de serviço
    public Oficina(List<OrdemDeServico> ordensServicos) {
        this.ordensServicos = ordensServicos;
    }

    // Retorna a lista de ordens de serviço
    public List<OrdemDeServico> getOrdensServicos() {
        return ordensServicos;
    }

    // Define a lista de ordens de serviço
    public void setOrdensServicos(List<OrdemDeServico> ordensServicos) {
        this.ordensServicos = ordensServicos;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "ordensServicos=" + ordensServicos +
                '}';
    }
}
