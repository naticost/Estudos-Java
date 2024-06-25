import java.util.Objects;

public class Carro implements Comparable<Carro> {
    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Carro carro = (Carro) object;
        return Objects.equals(getMarca(), carro.getMarca());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMarca());
    }

    @Override
    public int compareTo(Carro object) {
        if(this.marca.length()< object.marca.length()){
            return -1;

        }else if (this.marca.length()>object.marca.length()){
            return 1;
        }
        return 0;
    }
}
