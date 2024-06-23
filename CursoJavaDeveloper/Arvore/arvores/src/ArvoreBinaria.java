public class ArvoreBinaria <T extends Comparable<T>> {
    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BinNo<T> novNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novNo){
        if(atual==null){
            return novNo;
        }else if(novNo.getConteudo().compareTo(atual.getConteudo())< 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novNo));
        }
        return atual;

    }
}


