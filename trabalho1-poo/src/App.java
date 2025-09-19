import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // * Criação da Oficina
        Oficina oficina = new Oficina();

        // * Criação dos Serviços
        Servico servico1 = new Servico(1, "Troca de óleo", 100.0);
        Servico servico2 = new Servico(2, "Alinhamento", 80.0);
        Servico servico3 = new Servico(3, "Balanceamento", 60.0);

        // * Criação dos Clientes
        Cliente cliente1 = new Cliente("111.222.333-44", "Maria Silva");
        Cliente cliente2 = new Cliente("222.333.444-55", "Carlos Souza");
        Cliente cliente3 = new Cliente("333.444.555-66", "Ana Lima");

        // * Criação das Ordens de Serviço (Todas com mais de um serviço)
        List<Servico> lista1 = new ArrayList<>();
        lista1.add(servico1);
        lista1.add(servico2);
        OrdemDeServico ordem1 = new OrdemDeServico(1, cliente1, lista1);
        oficina.adicionaOS(ordem1);

        List<Servico> lista2 = new ArrayList<>();
        lista2.add(servico2);
        lista2.add(servico3);
        OrdemDeServico ordem2 = new OrdemDeServico(2, cliente2, lista2);
        oficina.adicionaOS(ordem2);

        List<Servico> lista3 = new ArrayList<>();
        lista3.add(servico1);
        lista3.add(servico3);
        OrdemDeServico ordem3 = new OrdemDeServico(3, cliente3, lista3);
        oficina.adicionaOS(ordem3);

        List<Servico> lista4 = new ArrayList<>();
        lista4.add(servico1);
        lista4.add(servico2);
        lista4.add(servico3);
        OrdemDeServico ordem4 = new OrdemDeServico(4, cliente1, lista4);
        oficina.adicionaOS(ordem4);

        List<Servico> lista5 = new ArrayList<>();
        lista5.add(servico1);
        lista5.add(servico3);
        OrdemDeServico ordem5 = new OrdemDeServico(5, cliente2, lista5);
        oficina.adicionaOS(ordem5);

        List<Servico> lista6 = new ArrayList<>();
        lista6.add(servico2);
        lista6.add(servico3);
        OrdemDeServico ordem6 = new OrdemDeServico(6, cliente3, lista6);
        oficina.adicionaOS(ordem6);

        // * Testes solicitados pelo trabalho
        // * 1. Buscar uma ordem de serviço pelo código
        System.out.println("\nBusca OS por código (3): " + oficina.buscaOSCodigo(3));

        // * 2. Buscar uma ordem de serviço pelo CPF do cliente
        System.out.println("\nBusca OS por CPF (222.333.444-55): " + oficina.buscaOSCPF("222.333.444-55"));

        // * 3. Buscar uma ordem de serviço pelo código do serviço
        System.out.println("\nBusca OS por código do serviço (1): " + oficina.buscaOSServico(1));

        // * 4. Calcular o faturamento total da oficina
        System.out.println("\nFaturamento total da oficina: R$ " + oficina.calculaFaturamentoTotal());
    }
}
