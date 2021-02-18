package exe4;

public abstract class Transporte {
    public Carga carga;
    public Transporte(float ca){
        this.carga = ca;
    }

    public float calcularFrete(float frete){
        return this.carga
    }
}
