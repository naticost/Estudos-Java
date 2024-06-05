public class Fila {

    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue( Object obj) {
        No novoNo = new No(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public Object first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (primeiroNo.getRefNo() != null) {
                primeiroNo = primeiroNo.getRefNo();
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public Object dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (primeiroNo.getRefNo() != null) {
                noAuxiliar = primeiroNo;
                primeiroNo = primeiroNo.getRefNo();
            }
            if (noAuxiliar == refNoEntradaFila) { // Caso especial para o único elemento
                refNoEntradaFila = null;
            } else {
                noAuxiliar.setRefNo(null);
            }
            return primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (noAuxiliar != null) {
                stringRetorno += "[No {objeto = " + noAuxiliar.getObject() + "}] ------>";
                noAuxiliar = noAuxiliar.getRefNo();
            }
            stringRetorno += "null";
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
