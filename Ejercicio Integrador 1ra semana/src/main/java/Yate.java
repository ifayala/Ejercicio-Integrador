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
        return super.calculaPrecioFuncion() + camarotes * 20;
    }

    public String toString() {
        return "***** Yate de lujo *****\n" + "Matrícula: " + super.getMatricula()
                + " | Metros de eslora: " + super.getEslora()
                + "\nAño de fabricación: " + getAñoFabricacion()
                + " | Potencia: " + super.getPotencia() + "CV"
                + " | Camarotes: " + camarotes;
    }
}