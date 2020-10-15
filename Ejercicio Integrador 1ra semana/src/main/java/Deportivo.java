public class Deportivo extends Barco {

    private int potencia;

    public Deportivo(int potencia, String matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double calculaPrecioFuncion() {
        return super.calculaPrecioFuncion() + potencia * 1;
    }

    public String toString() {
        return "***** Deportivo a motor *****\n"
                + "Matrícula: " + super.getMatricula()
                + " | Metros de eslora: " + super.getEslora()
                + "\nAño de fabricación: " + getAñoFabricacion()
                + " | Potencia: " + potencia + "CV";
    }
}