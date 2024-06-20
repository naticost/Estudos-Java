public class ListaDuplamenteEncadeada<T>{

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.ultimoNo = null;
        this.primeiroNo = null;
        this.tamanhoLista = 0;
    }


     public int size(){
         return tamanhoLista;
     }
}
