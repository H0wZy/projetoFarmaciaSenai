package app;

import enums.Cargo;

public class ProjetoFarmaciaApp {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Cargo cargo = Cargo.ALMOXARIFE;
        System.out.println("Eu trabalho como: " + cargo); // teste de retorno do ENUM cargo já formatado graças a classe "FormatarTexto".
    }
}