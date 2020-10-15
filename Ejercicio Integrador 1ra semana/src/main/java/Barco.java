import java.util.Calendar;
import java.util.GregorianCalendar;
public class Barco {

    private String matricula;
    private int eslora;
    private GregorianCalendar añoFabricacion;


    public Barco(String matricula, int eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = new GregorianCalendar(añoFabricacion, 12, 31);

    }

    public String getMatricula() {
        return matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion.get(Calendar.YEAR);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = new GregorianCalendar(añoFabricacion, 12, 31);
    }

    /*public void impuestoTipoBarco(double precioAmarre) {
        this.precioFuncion = this.precioFuncion + precioAmarre;
    }
*/
    public double calculaPrecioFuncion() {
        double precioFuncion=0;
        precioFuncion = eslora * 10;
        return precioFuncion;
    }

}