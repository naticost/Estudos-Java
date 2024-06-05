public class Main {

    public static void main(String[] args){
        Fila minhafila = new Fila();

        minhafila.enqueue(new No("Primeiro"));
        minhafila.enqueue(new No("Segundo"));
        minhafila.enqueue(new No("Terceiro"));
        minhafila.enqueue(new No("Quarto"));

        System.out.println(minhafila);

        minhafila.enqueue(1);
        System.out.println(minhafila);
        minhafila.enqueue(2);

        System.out.println(minhafila);







    }

}
