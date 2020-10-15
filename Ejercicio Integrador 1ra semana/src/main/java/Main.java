import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        double mayorAlq =0;
        int iMayor=0;
        double menorAlq =99999.0;
        int iMenor=0;
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
        Alquiler alquilerJuan = new Alquiler(juan, 10, 5, 2020, 29, 5, 2020, 21, velerito);

        ArrayList<Double> alquiler = new ArrayList<Double>();
        alquiler.add(alquilerPepe.calculaPrecioAlquiler(alquilerPepe.getBarco()));
        alquiler.add(alquilerCarlos.calculaPrecioAlquiler(alquilerCarlos.getBarco()));
        alquiler.add(alquilerJuan.calculaPrecioAlquiler(alquilerJuan.getBarco()));

        ArrayList<String> alquilerNomb = new ArrayList<String>();
        alquilerNomb.add(pepe.getNombre());
        alquilerNomb.add(carlos.getNombre());
        alquilerNomb.add(juan.getNombre());

        for(int i = 0; i < alquiler.size(); i++) {
            sumaAlq += alquiler.get(i);
            if(alquiler.get(i)>mayorAlq) {
                mayorAlq = alquiler.get(i);
                iMayor = i;
            }
            System.out.print(alquiler.get(i)+"|"+alquilerNomb.get(i)+"\n");
        }
        for(int i = 0; i < alquilerNomb.size(); i++) {
            if(alquiler.get(i)<menorAlq) {
                menorAlq=alquiler.get(i);
                iMenor = i;
            }

        }

        sumaAnual += sumaAlq;

        System.out.println("\n----------------------------------------------");

        System.out.printf("Alquiler menor Precio:\n"+alquiler.get(iMenor)+"|"+alquilerNomb.get(iMenor)+"\n");

        System.out.printf("Alquiler mayor Precio:\n"+alquiler.get(iMayor)+"|"+alquilerNomb.get(iMayor)+"\n");

        System.out.printf("Promedio alquileres:\n"+sumaAlq/alquiler.size()+"\n");

        System.out.printf("Promedio Anual alquileres:\n"+sumaAnual/12);
    }
}
