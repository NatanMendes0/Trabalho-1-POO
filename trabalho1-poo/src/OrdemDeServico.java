import java.util.List;

public class OrdemDeServico {
    private int codigo;
    private Cliente cliente;
    private List<Servico> servicos;

    public double calculaValorTotal() {
        double total = 0;
        for (Servico servico : servicos) {
            total += servico.getValor();
        }
        return total;
    }

    public boolean possuiServico(int codigo) {
        for (Servico servico : servicos) {
            if (servico.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public OrdemDeServico() {
    }

    public OrdemDeServico(int codigo, Cliente cliente, List<Servico> servicos) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.servicos = servicos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    @Override
    public String toString() {
        return "OrdemDeServico{" +
                "codigo=" + codigo +
                ", cliente=" + cliente +
                ", servicos=" + servicos +
                '}';
    }
}
