import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Pérez", 30, 2500.0);

        System.out.println("Empleado 1 (datos quemados):");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Edad: " + empleado1.getEdad());
        System.out.println("Salario: " + empleado1.getSalario());

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIngrese los datos del segundo empleado:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Salario: ");
        double salario = scanner.nextDouble();

        Empleado empleado2 = new Empleado(nombre, edad, salario);

        System.out.println("\nEmpleado 2 (datos ingresados por el usuario):");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Edad: " + empleado2.getEdad());
        System.out.println("Salario: " + empleado2.getSalario());

        scanner.close();
    }
}
