package models;

import java.util.ArrayList;

import enums.Cargo;
import enums.Genero;
import enums.TipoSetor;
import interfaces.ICalculavel;

public class Funcionario implements ICalculavel {

    private String nome;
    private int id, idade;
    private Genero genero;
    private Cargo cargo;
    private double salario;
    private Beneficios beneficios;
    private Setor setor;

    public Funcionario(String nome, int id, int idade, Genero genero,
            Cargo cargo, double salario, Setor setor) {

        if (idade < 0)
            throw new IllegalArgumentException("Idade inválida");
        if (salario <= 0)
            throw new IllegalArgumentException("Salário deve ser maior que zero");

        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.genero = genero;
        this.cargo = cargo;
        this.salario = salario;
        this.setor = definirSetorPorCargo(cargo);
        this.beneficios = calcularBeneficiosPorCargo(cargo);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Beneficios getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(Beneficios beneficios) {
        this.beneficios = beneficios;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    private static Setor setarTipoSetor(TipoSetor tipoSetor) {

        return new Setor(tipoSetor, new ArrayList<>());
    }

    private static Setor definirSetorPorCargo(Cargo cargo) {
        TipoSetor tipoSetor;

        switch (cargo) {
            case GERENTE:
                tipoSetor = TipoSetor.GERENCIA_FILIAL;
                break;
            case ATENDENTE:
                tipoSetor = TipoSetor.ATENDIMENTO_CLIENTE;
                break;
            case RH:
                tipoSetor = TipoSetor.GESTAO_PESSOAS;
                break;
            case FINANCEIRO:
                tipoSetor = TipoSetor.FINANCEIRO;
                break;
            case VENDEDOR:
                tipoSetor = TipoSetor.VENDAS;
                break;
            case ALMOXARIFE:
                tipoSetor = TipoSetor.ALMOXARIFADO;
                break;
            case MOTORISTA:
                tipoSetor = TipoSetor.TRANSPORTADORAS;
                break;
            default:
                throw new IllegalArgumentException("Cargo inválido");
        }

        return setarTipoSetor(tipoSetor);
    }

    private static Beneficios calcularBeneficiosPorCargo(Cargo cargo) {
        double valeRefeicao = 300, valeAlimentacao = 300, planoSaude = 3000, planoOdonto = 3000;

        switch (cargo) {
            case GERENTE:
                valeRefeicao *= 2;
                valeAlimentacao *= 2;
                planoSaude *= 1.5;
                planoOdonto *= 1.5;
                break;
            case VENDEDOR:
                valeRefeicao *= 1.5;
                valeAlimentacao *= 1.5;
                break;
            case FINANCEIRO:
            case RH:
                planoSaude *= 1.3;
                break;
            case MOTORISTA:
            case ALMOXARIFE:
                valeAlimentacao *= 1.2;
                break;
            case ATENDENTE:
                break;
            default:
                // Nenhuma alteração para cargos não mapeados.
                break;
        }

        return new Beneficios(valeRefeicao, valeAlimentacao, planoSaude, planoOdonto);
    }

    @Override
    public double calcular() {
        return ICalculavel.super.calcular();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", idade=" + idade +
                ", genero=" + genero +
                ", cargo=" + cargo +
                ", setor=" + (setor != null ? setor.getTipoSetor() : "Nenhum") +
                ", salario='R$" + String.format("%.2f", salario) + '\'' +
                ", beneficios="
                + (beneficios != null
                        ? "[valeRefeicao='R$" + String.format("%.2f", beneficios.getValeRefeicao()) + '\'' +
                                ", valeAlimentacao='R$" + String.format("%.2f", beneficios.getValeAlimentacao()) + '\''
                                +
                                ", planoSaude='R$" + String.format("%.2f", beneficios.getPlanoSaude()) + '\'' +
                                ", planoOdonto='R$" + String.format("%.2f", beneficios.getPlanoOdonto()) + '\'' + "]"
                        : "Nenhum")
                + '}';
    }
}