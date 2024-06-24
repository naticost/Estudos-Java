import java.util.Objects;

public class Obj extends ObjArvore<Obj> {
    Integer meuValor;

    public Obj(Integer meuValor){
        this.meuValor = meuValor;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Obj obj = (Obj) object;
        return Objects.equals(meuValor, obj.meuValor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(meuValor);
    }

    @Override
    public int compareTo(Obj outro) {
        int i = 0;
        if (this.meuValor > outro.meuValor) {
            i = 1;
        } else if (this.meuValor < outro.meuValor) {
            i = -1;
        }
        return i;
    }

    @Override
    public String toString() {
        return meuValor.toString();
    }
}
