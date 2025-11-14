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

                System.out.println("-Precio 1-");
                System.out.println("Costo Unitario 1: ")
                double p1 = lector.nextDouble();

                double q1 = cantidadPedido(D,S h1);
                double to1 = duracionCiclo(q1, D);
                double n1 = N(to1, 1);
                double le1 = Le(1, n1, to1);
                double pr1 = puntoReorden(le1, D);

                double costoTotal1= (D/q1) * S + (q1/2) * h1 + D * p1;
                
                System.out.println("Costo Unitario 1: "+p1);
                System.out.println("Costo de Almacenamiento: + h1");
                System.out.println("Cantidad optima del pedido: " + (int)q1);
                System.out.println("Duración del ciclo:" + to1);
                System.out.println("N:" + n1);
                System.out.println("Le: "+ le1);
                System.out.println("Punto de Reorden:"+pr1);
                System.out.println("Costo total unitario:"+costoTotal1);
                System.out.println();



            }


        } while (opcion !=3);

    }

}
