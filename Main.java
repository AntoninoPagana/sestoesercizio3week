public class Main {
    public static void main(String[] args) {
        Triangolo triangolo = new Triangolo(5,9, TipoForma.TRIANGOLO);
        triangolo.calcolaArea();

        Rettangolo rettangolo = new Rettangolo(10,9,TipoForma.RETTANGOLO);
        rettangolo.calcolaArea();
    }
}
