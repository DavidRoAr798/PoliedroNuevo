import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        List<Poliedro> arrayList = new ArrayList<>();
        System.out.println("Introduce el numero de poliedros, para cada tipo:  ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++)

        {
            System.out.println("Introduce los datos del cubo " + i);
            System.out.println("Introduce la arista:");
            double arista = sc.nextDouble();
            String colorSeleccionado = solicitarColor();
            System.out.println("El color seleccionado es: " + colorSeleccionado);

            Cubo cubo = new Cubo(arista, +i, colorSeleccionado);
            arrayList.add(cubo);


        }

        for (int i = 1; i <= numero; i++)

        {
            System.out.println("Introduce los datos del Octaedro " + i);
            System.out.println("Introduce la arista:");
            double arista = sc.nextDouble();

            Octaedro octaedro = new Octaedro(arista, i + numero);
            arrayList.add(octaedro);
        }

        for (int i = 1; i <= numero; i++)

        {
            System.out.println("Introduce los datos del Tetraedro " + i);
            System.out.println("Introduce la arista:");
            double arista = sc.nextDouble();

            Tetraedro tetraedro = new Tetraedro(arista, i + numero * 2);
            arrayList.add(tetraedro);
        }


        Poliedro max = null;
        Poliedro min = null;
        double totalVolumen = 0.0;
        int cont20to = 0;
        int cont20to100 = 0;
        int contOver100 = 0;

        for (Poliedro poliedro : arrayList) // recorremos el array
        {
            double volumenActual = poliedro.calculaVolumen();
            //double perimetro = figuraGeometrica.calculaPerimetro();
            System.out.println("El volumen de la figura geometrica " + poliedro.getId() + " es = " + volumenActual);
            //System.out.println("El perimetro de la figura geometrica " + " es =" + perimetro);

            totalVolumen = totalVolumen + volumenActual;

            if (poliedro instanceof Cubo) {
                Cubo cubo = (Cubo) poliedro;
                double diagonal = cubo.calculaDiagonal();
                System.out.println("La diagonal del cubo es= " + diagonal);

            }

            if (max == null) {
                max = poliedro;
            } else {
                if (volumenActual > max.calculaVolumen()) {
                    max = poliedro;
                }
            }

            if (min == null) {
                min = poliedro;
            } else {
                if (volumenActual < min.calculaVolumen()) {
                    min = poliedro;
                }
            }

            if (volumenActual <= 20) {
                cont20to++;
            } else if (volumenActual <= 100) {
                cont20to100++;
            } else {
                contOver100++;
            }
        }


        int totalFiguras = numero * 3;
        double media = totalVolumen / totalFiguras;
        System.out.println("La media del volumen de las figuras geometricas es: " + media);
        System.out.println("El poliedro con volumen maximo es: " + max);
        System.out.println("El poliedro con volumen min es " + min);

        System.out.println("El numero de figuras con volumen inferior a 20 es:" + cont20to);
        System.out.println("El numero de figuras con volumen entre 20 y 100 es:" + cont20to100);
        System.out.println("El numero de figuras con volumen superior a 100 es:" + contOver100);

    }

    private static String solicitarColor() {
        // crear con el scanner una petición
        // el usuario debera introducir el numero entero de 1 a 5
        // por lo tanto se mostrará un menu del estilo de :
        //1.azul 2.blanco 3.rojo 4.verde 5.naranja
        //si selecciona el cuatro, se debera devolver 4.verde
        return "verde";
    }
}




