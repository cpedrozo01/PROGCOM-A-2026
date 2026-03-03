16.
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = sc.nextInt();

        System.out.println("Con for:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        System.out.println("\nCon while:");
        int i = 1;
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
    }
}

17.
import java.util.Scanner;

public class SumaNaturales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa n: ");
        int n = sc.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        System.out.println("Suma con for: " + suma);

        suma = 0;
        int i = 1;
        while (i <= n) {
            suma += i;
            i++;
        }
        System.out.println("Suma con while: " + suma);
    }
}

18.
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("No existen factoriales negativos");
        } else {
            long factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial con for: " + factorial);

            factorial = 1;
            int i = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial con while: " + factorial);
        }
    }
}

19.
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de términos: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Con for:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println("\nCon while:");
        a = 0;
        b = 1;
        int i = 0;
        while (i < n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        }
    }
}


20.
import java.util.Scanner;

public class AdivinarColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] colores = new String[10];

        System.out.println("Define 10 colores:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Color " + (i + 1) + ": ");
            colores[i] = sc.nextLine();
        }

        String secreto = colores[0]; 
        int intentos = 0;
        boolean adivinado = false;

        while (intentos < 10 && !adivinado) {
            System.out.print("Adivina el color: ");
            String intento = sc.nextLine();
            intentos++;

            if (intento.equalsIgnoreCase(secreto)) {
                System.out.println("¡Correcto!");
                adivinado = true;
            } else {
                System.out.println("Incorrecto.");
            }
        }

        if (!adivinado) {
            System.out.println("Se acabaron los intentos.");
        }
    }
}


21.
public class NumerosPares {
    public static void main(String[] args) {

        System.out.println("Con for:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nCon while:");
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}


22.
import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();

        int suma = 0;
        int numero = Math.abs(num);

        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }

        System.out.println("Suma de dígitos: " + suma);
    }
}


23.
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("No es primo");
        } else {
            boolean esPrimo = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
        }
    }
}


24.
import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de filas: ");
        int filas = sc.nextInt();

        System.out.println("Con for:");
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Con while:");
        int i = 1;
        while (i <= filas) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}


25.
import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        int base = sc.nextInt();
        System.out.print("Exponente: ");
        int exponente = sc.nextInt();

        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        System.out.println("Potencia con for: " + resultado);

        resultado = 1;
        int i = 0;
        while (i < exponente) {
            resultado *= base;
            i++;
        }
        System.out.println("Potencia con while: " + resultado);
    }
}