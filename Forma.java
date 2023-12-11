enum TipoForma{
    TRIANGOLO,
    RETTANGOLO
}
public class Forma {
    private final TipoForma tipo;
    public Forma(TipoForma tipo){
        this.tipo = tipo;
    }
    public void calcolaArea(){};
}
