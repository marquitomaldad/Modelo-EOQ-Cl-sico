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
                System.out.println("Costo Unitario 1: ");
                double p1 = lector.nextDouble();

                System.out.println("Costo de almacenamiento 1: ");
                double h1 = lector.nextDouble();

                double q1 = cantidadPedido(D,S, h1);
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

                System.out.println("-Precio 2-");
                System.out.println("Costo Unitario 2:");
                double p2 = lector.nextDouble();

                System.out.println("Costo de almacenamiento 2: ");
                double h2 = lector.nextDouble();

                double q2 = cantidadPedido(D,S, h2);
                double to2 = duracionCiclo(q1, D);
                double n2 = N(to2, 1);
                double le2 = Le(1, n2, to2);
                double pr2 = puntoReorden(le2,D);

                double costoTotal2 = (D/q2)* S + (q2/2)*h2+D*p2;

                System.out.println("Costo Unitario 2: "+p2);
                System.out.println("Costo de almacenamiento:"+h2);
                System.out.println("Cantidad optima del pedido: "+(int)q2);
                System.out.println("Duración del ciclo: "+ to2);
                System.out.println("N:" +n2);
                System.out.println("Le: "+ le2);
                System.out.println("Punto de reorden:"+pr2);
                System.out.println("Costo total unitario: "+costoTotal2);
                System.out.println();

                System.out.println("-Precio 3-");
                System.out.println("Costo Unitario 3: ");
                double p3 = lector.nextDouble();

                System.out.println("Costo de almacenamiento 3: ");
                double h3 = lector.nextDouble();

                double q3 = cantidadPedido(D,S,h3);
                double to3 = duracionCiclo(q3, D);
                double n3 = N(to3, 1);
                double le3 = Le(1, n3, to3);
                double pr3 = puntoReorden(le3, D);

                double costoTotal3 = (D / q3) * S + (q3/2)*h3+D*p3;

                System.out.println("Costo Unitario 3: "+p3);
                System.out.println("Costo de almacenamiento: "+ h3);
                System.out.println("Cantidad optima del pedido "+ (int)q3);
                System.out.println("Duración del ciclo: "+to3);
                System.out.println("N: "+n3);
                System.out.println("Le: "+le3);
                System.out.println("Punto de reorden: "+pr3);
                System.out.println("Costo total unitario: "+costoTotal3);
                System.out.println();

                System.out.println("-Mejor opción-");
                if(costoTotal1 < costoTotal2 && costoTotal1 < costoTotal3){
                    System.out.println("Mejor Precio 1");
                }else if (costoTotal2<costoTotal1 && costoTotal2<costoTotal3){
                    System.out.println("Mejor Precio 2");
                }else{
                    System.out.println("Mejor Precio 3");
                }

                System.out.println();

            }


        } while (opcion !=3);

        System.out.println("Programa finalizado");

    }
    public static double cantidadPedido(double D, double S, double H){
        return Math.sqrt((2*D*S)/H);
    }

    public static double duracionCiclo(double Q, double D){
        return Q/D;
    }
    
    public static double N(double to, double l){
        return l/to;
    }

    public static double Le(double l, double N, double to){
        return l - N * to;
    }
    public static double puntoReorden(double le, double D){
        return le * D;
    }


}
