package interfaces;

public interface ICalculavel {
    default double calcular(double salario, double lucro) {
        return  0.0;
    }
}