package interfaces;

public interface ICalculavel {
public default double calcular(double salario, double lucro) {
        return lucro;
    }
}