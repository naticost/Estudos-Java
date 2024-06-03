public class Pilha {

    private No refNoEntrad = null;

    public Pilha (){

    }

    public void push(No novoNO){
        No refAuxiliar = this.refNoEntrad;
        this.refNoEntrad = novoNO;
        this.refNoEntrad.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = this. refNoEntrad;
            this.refNoEntrad = this.refNoEntrad.getRefNo();
            return noPoped;
        }else{
            return null;
        }
    }


    public No top(){
        return this.refNoEntrad;
    }

    public boolean isEmpty() {
        return this.refNoEntrad == null;
    }
    @Override
    public String toString(){
        String stringRetorno = "============================\n";
        stringRetorno += "Pilha\n";
        stringRetorno += "============================\n";

        No noAuxiliar = refNoEntrad;
        while (true){
            if (noAuxiliar !=null){
                stringRetorno += "[No {dado = " + noAuxiliar .getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();

            }else{
                break;
            }
        }
        stringRetorno += "============================\n";
        return stringRetorno;
    }

}
