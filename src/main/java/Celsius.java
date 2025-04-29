//classe filha

public class Celsius extends Temperatura {

    //Cronstrutor
    public Celsius(double valorGraus) {
        //O super se refere a Classe Pai
        super(valorGraus);
    }

    //Criando os métodos p/ converter
    public double paraFahrenheit() {
        return (getGraus() * 9 / 5) + 32;
    }

    //criando o método de Celsius p/ Kelvin
    public double paraKelvin() {
        return getGraus() + 273;
    }
}
