public class Main {

    public static void main(String[] args){
        Fila <String> minhafila = new Fila();

        minhafila.enqueue("Primeiro");
        minhafila.enqueue ("Segundo");
        minhafila.enqueue("Terceiro");
        minhafila.enqueue("Quarto");

        System.out.println(minhafila);
        minhafila.enqueue("ultimo");
        System.out.println(minhafila);








    }

}
