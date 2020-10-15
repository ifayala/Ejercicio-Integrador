import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        double mayorAlq =0;
        Alquiler alqMayor=null;
        double menorAlq =99999.0;
        Alquiler alqMenor=null;
        double sumaAlq=0;
        double sumaAnual=0;

        Barco rayoMcQuin = new Deportivo(500, "999-COW", 8, 2003);
        Barco velerito = new Velero(2, "666-AWS", 10, 2005);
        Barco yatecito = new Yate(3, 500, "666-AWS", 20,2020);

        Cliente pepe = new Cliente("Pepe", "10123456");
        Cliente carlos = new Cliente("Carlos", "20123456");
        Cliente juan = new Cliente("Juan", "30123456");

        Alquiler alquilerPepe = new Alquiler(pepe, 23, 5, 2020, 29, 5, 2020, 23, rayoMcQuin);
        Alquiler alquilerCarlos = new Alquiler(carlos, 01, 5, 2020, 29, 5, 2020, 22, velerito);
        Alquiler alquilerJuan = new Alquiler(juan, 10, 5, 2020, 29, 5, 2020, 21, yatecito);

        ArrayList<Alquiler> alquiler = new ArrayList<Alquiler>();
        alquiler.add(alquilerPepe);
        alquiler.add(alquilerCarlos);
        alquiler.add(alquilerJuan);


        for (Alquiler alq:alquiler
        ) {
            double precioalq = alq.calculaPrecioAlquiler();
            if (alqMayor==null)
                alqMayor = alq;
            if (alqMenor==null)
                alqMenor = alq;
            if (precioalq > alqMayor.calculaPrecioAlquiler())
                alqMayor = alq;
            if (precioalq < alqMenor.calculaPrecioAlquiler())
                alqMenor= alq;
            sumaAlq += precioalq;
        }

        sumaAnual += sumaAlq;

        System.out.println("\n----------------------------------------------");

        System.out.printf("Alquiler menor Precio:\n"+alqMenor.calculaPrecioAlquiler()+"|"+alqMenor.getCliente().getNombre()+"\n");

        System.out.printf("Alquiler mayor Precio:\n"+alqMayor.calculaPrecioAlquiler()+"|"+alqMayor.getCliente().getNombre()+"\n");

        System.out.printf("Promedio alquileres:\n"+sumaAlq/alquiler.size()+"\n");

        System.out.printf("Promedio Anual alquileres:\n"+sumaAnual/12);
    }
}