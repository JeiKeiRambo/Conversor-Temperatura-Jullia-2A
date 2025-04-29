//Classe pai - As outras vão Herdar
public class Temperatura {
    //ATRIBUTO
    private double graus;
    
    //Construtor
    public Temperatura(double valorGraus){
        this.graus = valorGraus;
}
    
    //GETTERR DO GRAUS
    public double getGraus(){
        return graus;
    }
    
    //SETTER DO GRAUS
    public void setGraus(double novoGraus){
        this.graus = novoGraus;
            
            
}
}
