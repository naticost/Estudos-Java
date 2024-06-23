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
    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);

    }
    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }

    }
    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);

    }
    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + ", ");
        }
        
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);

    }
    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.println(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
        
    }



}


