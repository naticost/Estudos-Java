public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue( T object) {
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (primeiroNo.getRefNo() != null) {
                primeiroNo = primeiroNo.getRefNo();
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (primeiroNo.getRefNo() != null) {
                noAuxiliar = primeiroNo;
                primeiroNo = primeiroNo.getRefNo();
            }
            if (noAuxiliar == refNoEntradaFila) {
                refNoEntradaFila = null;
            } else {
                noAuxiliar.setRefNo(null);
            }
            return (T) primeiroNo.getObject();
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
