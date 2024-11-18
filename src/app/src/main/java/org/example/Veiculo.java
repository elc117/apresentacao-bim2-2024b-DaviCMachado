
package davi;

public interface Veiculo {
    String acelerar();
}

class Moto implements Veiculo {
    @Override
    public String acelerar() {
        return "Moto acelerando";
    }
}


class Carro implements Veiculo {
    @Override
    public String acelerar() {
        return "Carro acelerando";
    }
}
