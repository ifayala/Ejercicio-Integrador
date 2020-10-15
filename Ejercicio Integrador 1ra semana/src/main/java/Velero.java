public class Velero extends Barco {

    private int numeroMastiles;

    public Velero(int numeroMastiles, String matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public double calculaPrecioFuncion() {
        return super.calculaPrecioFuncion() + numeroMastiles * 5;
    }

    public String toString() {
        return "****** Velero ******\n" + "Matrícula: " + super.getMatricula()
                + " | Metros de eslora: " + super.getEslora()
                + "\nAño de fabricación: " + getAñoFabricacion()
                + " | Mastiles: " + numeroMastiles;
    }
}