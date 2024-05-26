public class Carro extends Veiculo{
    public void ligar (){
        confereCombustivel();
        System.out.println("Carro ligado");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo Combustivel do carro");
    }
    
}