public class Rettangolo extends Forma {
    private int base;
    private int altezza;
    public Rettangolo(int base, int altezza){
        super(TipoForma.RETTANGOLO);
        this.base = base;
        this.altezza = altezza;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltezza() {
        return altezza;
    }
    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        super.calcolaArea();
        int area = this.getBase() * this.getAltezza();
        System.out.println("Area Rettangolo: " + area);
    }
}
