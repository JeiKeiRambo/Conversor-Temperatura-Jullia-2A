//Classe filha
public class Fahrenheit extends Temperatura{
    
    //Cronstrutor
    public Fahrenheit(double valorGraus) {
        //O super se refere a Classe Pai
        super(valorGraus);
    }

    //Criando os métodos p/ converter Fahrenheit p/ Celsius
    public double paraCelsius() {
        return (getGraus()-32)*5/9;
    }

    //criando o método de fahrenheit p/ Kelvin
    public double paraKelvin() {
        return paraCelsius()+273;
    }
}
