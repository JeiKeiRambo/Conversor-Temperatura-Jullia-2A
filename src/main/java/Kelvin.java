//Classe filha
public class Kelvin extends Temperatura{
    
    //Cronstrutor
    public Kelvin(double valorGraus) {
        //O super se refere a Classe Pai
        super(valorGraus);
    }

    //Criando os métodos p/ converter Kelvin p/ Celsius
    public double paraCelsius() {
        return getGraus()-273;
    }

    //criando o método de Kelvin p/ Fahrenheit
    public double paraFahrenheit() {
        return (paraCelsius()*9/5)+32;
    }
}