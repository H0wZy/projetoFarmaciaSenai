package app;

import enums.Cargo;
import enums.Genero;
import models.Funcionario;

public class ProjetoFarmaciaApp {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Cargo cargo = Cargo.ALMOXARIFE;
        System.out.println("Eu trabalho como: " + cargo); // teste de retorno do ENUM cargo já formatado graças a classe "FormatarTexto".

        Funcionario f1 = new Funcionario("Marcos", 1, 22, Genero.MASCULINO, Cargo.GERENTE, 1400, null);
        System.out.println(f1.toString());
    }
}