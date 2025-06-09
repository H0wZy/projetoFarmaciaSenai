package services;

import interfaces.ICalculavel;
import models.Empresa;
import models.Produto;
import models.Setor;
import models.Transportadora;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EmpresaService extends Empresa implements ICalculavel {
    private Map<Integer, Map<Integer, Map<Produto, Integer>>> vendasMesAno;

    public EmpresaService(String nome, List<Setor> setores, List<Produto> produtos, List<Transportadora> transportadoras) {
        super(nome, setores, produtos, transportadoras);
        this.vendasMesAno = new HashMap<>();
    }

    public void programarVenda(int ano, int mes, Produto produto, int quantidade) {
        vendasMesAno.computeIfAbsent(ano, y  -> new HashMap<>()).computeIfAbsent(mes, x -> new HashMap<>()).merge(produto, quantidade , Integer::sum);
    }

    public double lucroMes(int ano, int mes) { //Esse é um método para calcular o lucro de um mes específico
        double vendas = 0;
        double custos = 0;

        Map<Produto, Integer> vendasDoMes = vendasMesAno
                .getOrDefault(ano, new HashMap<>())
                .getOrDefault(mes, new HashMap<>());

        for(Map.Entry<Produto, Integer> entry : vendasDoMes.entrySet()) {
            Produto product = entry.getKey();
            int quantidade = entry.getValue();

            vendas += product.getPrecoVenda() * quantidade;
            custos += product.getPrecoCompra() * quantidade;
        }
        return vendas - custos;
    }

    public double lucroAno(int ano, int mes) {
        double totalVendas = 0;

        Map<Integer, Map<Produto, Integer>> meses = vendasMesAno.getOrDefault(ano, new HashMap<>());

        for( int mesesAno : meses.keySet()){
            totalVendas += lucroMes(ano , mes);
        }

        return totalVendas;
    }

    @Override
    public double calcular(){ //aqui está pegando os meses e o ano e utilizando para conseguir verificar os lucros
        int mes = getMes();
        int ano = getAno();
        double caixaTotal = getCaixaTotal();

        double valorTotal = lucroMes(ano, mes);
        caixaTotal += valorTotal;

        return caixaTotal;
    }

    public void exibirResumoAnuais(int ano) {
        System.out.println("Resumo de Lucros - Ano: " + ano);
        for (int mes = 1; mes <= 12; mes++) {
            double lucro = lucroMes(ano, mes);
            System.out.printf("Mês %02d: R$ %.2f\n", mes, lucro);
        }
    }

    public int getMes(){
        return LocalDate.now().getMonthValue();
    } //get para o mês do computador


    public int getAno(){
        return LocalDate.now().getYear();
    } //get para o ano do computador


    public Map<Integer, Map<Integer, Map<Produto, Integer>>> getVendasMesAno() {
        return vendasMesAno;
    }// Pega as chaves de mes dia e quantidade de produto

    public void setVendasMesAno(Map<Integer, Map<Integer, Map<Produto, Integer>>> vendasMesAno) {
        this.vendasMesAno = vendasMesAno;
    }
}
