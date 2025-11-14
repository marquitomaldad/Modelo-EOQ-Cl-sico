import java.util.Scanner;

public class ModeloEOQ {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int opcion;

        do{
            System.out.println("-Menú de modelos EOQ-");
            System.out.println("1. EOQ Clásico");
            System.out.println("2. EOQ con Descuentos");
            System.out.println("3. Salir");
            System.out.println("Elige una opción");
            opcion =lector.nextInt();

            if (opcion ==1){
                double D,S,H;

                System.out.println("Modelo EOQ Clásico");

                System.out.println("Demanda Anual (D): ");
                D = lector.nextDouble();

                System.out.println("Costo de Pedido (S): ");
                S = lector.nextDouble();

                System.out.println("Costo de Mantenimiento (H): ");
                H = lector.nextDouble();

                double eoq = cantidadPedido(D, S, H);

                System.out.println("El EOQ es: " + eoq);
                System.out.println();
            }
            
            if(opcion == 2){

                double D,S;

                System.out.println("Modelo EOQ con descuento");

                System.out.println("Demanda anual (D)");
                D = lector.nextDouble();

                System.out.println("Costo de Pedido (S)");
                S = lector.nextDouble();



            }


        } while (opcion !=3);

    }

}
