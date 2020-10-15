public class Yate extends Deportivo {

    private int camarotes;

    public Yate(int camarotes, int potencia, String matricula, int eslora, int añoFabricacion) {
        super(potencia, matricula, eslora, añoFabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    public double calculaPrecioFuncion() {
        double precioYate=super.calculaPrecioFuncion()+camarotes;
        return precioYate;
    }


}