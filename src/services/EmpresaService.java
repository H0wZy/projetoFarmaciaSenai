package services;

import models.Empresa;
import models.Produto;
import models.Setor;
import models.Transportadora;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EmpresaService extends Empresa {
    private Map<Integer, Map<Integer, Map<Produto, Integer>>> vendasMes;

    public EmpresaService(String nome, List<Setor> setores, List<Produto> produtos, List<Transportadora> transportadoras) {
        super(nome, setores, produtos, transportadoras);
        this.vendasMes = new HashMap<>();
    }

    public void programarVenda(int ano, int mes, Produto produto, int quantidade) {
        vendasMes.computeIfAbsent(ano, y  -> new HashMap<>()).computeIfAbsent(mes, x -> new HashMap<>()).merge(produto, quantidade , Integer::sum);
    }



    public int getMes(){
        return LocalDate.now().getMonthValue();
    } //get para o mês do computador


    public int getAno(){
        return LocalDate.now().getYear();
    } //get para o ano do computador


    public Map<Integer, Map<Integer, Map<Produto, Integer>>> getVendasMes() {
        return vendasMes;
    }// Pega as chaves de mes dia e quantidade de produto

    public void setVendasMes(Map<Integer, Map<Integer, Map<Produto, Integer>>> vendasMes) {
        this.vendasMes = vendasMes;
    }
}
