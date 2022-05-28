import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       
        double subtotal = 0.0;
        String res = "";
        do {
            System.out.println("SUBTOTAL: " + subtotal);
            System.out.println("Ingrese el valor unitario: ");
            double valorUnitario = sc.nextDouble();

            System.out.println("El producto cuenta con iva: (S/N)");
            String tieneIva = sc.next();
            if (tieneIva.equals("S")) {
                System.out.println("Ingrese la cantidad que lleva el cliente del producto a registrar: ");
                double cantidad = sc.nextDouble();
                System.out.println("IVA incluido: ");
                double iva = 0.19 * valorUnitario * cantidad;
                subtotal += cantidad * valorUnitario + iva;
                System.out.println("SUBTOTAL: " + subtotal);

                System.out.println("¿Faltan productos productos por cobrar? (S/N)");
                res = sc.next();

            } else if (tieneIva.equals("N")) {
                System.out.println("Ingrese la cantidad que lleva el cliente del producto a registrar: ");
                double cantidad = sc.nextDouble();
                System.out.println("PRODUCTO SIN IVA");
                subtotal += valorUnitario * cantidad;
                System.out.println("SUBTOTAL: " + subtotal);

                System.out.println("¿Faltan productos productos por cobrar? (S/N)");
                res = sc.next();

            }
        } while (res.equals("S") || !res.equals("N"));
        
        System.out.println("TOTAL: " + subtotal);
        
        sc.close();
    }
}
