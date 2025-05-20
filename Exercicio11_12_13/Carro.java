interface Veiculo {
    void acelerar();
    void frear();
}

public class Carro implements Veiculo {
    private int velocidade;

    public Carro() {
        velocidade = 0;
    }

    @Override
    public void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        if (velocidade > 0) {
            velocidade -= 10;
        }
        System.out.println("Freando... Velocidade atual: " + velocidade + " km/h");
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();
    }
}
