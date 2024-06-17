
public class ListaEncadeada<T> {

    private No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size() - 1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
/*Percorre a lista encadeada até o índice especificado e retorna o nó nessa posição. 
Utiliza uma referência auxiliar (noAuxiliar) para iterar pela lista e outra variável (noRetorno) para armazenar o nó atual. */
        validaIndice(index); // Verifica se o índice é válido
        No<T> noAuxiliar = referenciaEntrada; // Começa no primeiro nó
        No<T> noRetorno = null; // Variável para armazenar o nó que será retornado
        for(int i = 0; i <= index; i++) { // Percorre a lista até o índice desejado
            noRetorno = noAuxiliar; // Atualiza noRetorno para o nó atual
            noAuxiliar = noAuxiliar.getProximoNo(); // Avança para o próximo nó
        }
        return noRetorno; // Retorna o nó na posição index
    }
    
    public T remove(int index) {
        validaIndice(index); // Verifica se o índice é válido, lançando uma exceção se não for
        No<T> noPivor = getNo(index); // Obtém o nó que está na posição indicada pelo índice
        if(index == 0) { // Caso especial: removendo o primeiro nó
            referenciaEntrada = noPivor.getProximoNo(); // Atualiza a referência de entrada para o próximo nó
            return noPivor.getConteudo(); // Retorna o conteúdo do nó removido
        }
        No<T> noAnterior = getNo(index - 1); // Obtém o nó anterior ao nó que será removido
        noAnterior.setProximoNo(noPivor.getProximoNo()); // Atualiza a referência do próximo nó no nó anterior para pular o nó removido
        return noPivor.getConteudo(); // Retorna o conteúdo do nó removido
    }
    

    public int size() {
        int tamanhoLista = 0; // Inicializa o contador de nós
// a referenciaAux não é um contador de índice, mas uma referência usada para navegar pela lista, enquanto tamanhoLista é o verdadeiro contador que rastreia o número de nós visitados.

        No<T> referenciaAux = referenciaEntrada; // Inicializa a referência auxiliar com o primeiro nó
        while(true) {
            if(referenciaAux != null) { // Enquanto a referência auxiliar não for null
                tamanhoLista++; // Incrementa o contador de nós
                if(referenciaAux.getProximoNo() != null) { // Se há um próximo nó
                    referenciaAux = referenciaAux.getProximoNo(); // Move para o próximo nó
                } else { // Se não há próximo nó
                    break; // Interrompe o loop
                }
            } else { // Se a referência auxiliar é null
                break; // Interrompe o loop
            }
        }
        return tamanhoLista; // Retorna o número de nós contados
    }
    
    private void validaIndice(int index){
//Esse método verifica se o índice fornecido é válido (dentro do intervalo da lista). Se o índice for inválido, ele lança uma exceção IndexOutOfBoundsException
        if(index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + '.');
        }
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    public No<T> getReferenciaEntrada() {
        return referenciaEntrada;
    }

    public void setReferenciaEntrada(No<T> referenciaEntrada) {
        this.referenciaEntrada = referenciaEntrada;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() +"}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}