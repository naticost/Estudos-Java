public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("1234B");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("12345A");
        z400.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();

    }
    /* No exemplo anterior, quando tenho uma classe genérica que age como um coringa, ela mantém um método sem precisar saber sobre a classe especializada. O comportamento que ela assume depende das várias classes que ela pode representar. */

}
