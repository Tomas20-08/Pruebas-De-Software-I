
package Taller;

import java.util.Scanner;
 
public class FormularioCompleto {
    
    public static boolean validarNombre (String nombre){
        return nombre != null && nombre.length()>=3;
    }
    
    public static boolean validarEdad(int edad) {
        return edad >= 18 && edad <= 65;
    }
    
    public static boolean validarCorreo(String correo){
        return correo.contains("@") && correo.endsWith(".com");
    }
    
    public static boolean validarTelefono (String telefono){
        return telefono.length() == 10;
    }
    
    public static boolean validarPassword (String password){
        return password.length() >= 6;
    }
    
    public static double calcularDescuento(int edad) {
        if (edad > 50) return 0.25;
        else if (edad >= 30) return 0.15;
        return 0.05;
    }
    
    public static double calcularCostoEnvio(String ciudad) {
        if (ciudad.equalsIgnoreCase("Bogota")) return 5000;
        else if (ciudad.equalsIgnoreCase("Medellin")) return 7000;
        return 10000;
    }
    
    public static void registrarUsuario(Scanner sc) {
        System.out.println("\n--- REGISTRO DE USUARIO ---");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Correo: ");
        String correo = sc.nextLine();
        
        if (!validarCorreo(correo)) {
        System.out.println("El correo de contener @ y debe terminar en .com");
        return;
        }
        
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        System.out.print("Contraseña: ");
        String password = sc.nextLine();
        System.out.print("Ciudad: ");
        String ciudad = sc.nextLine();
        
        if (!validarNombre(nombre)) {
        System.out.println("Nombre Inválido");
        return;
        }
        
        if (!validarEdad(edad)) {
        System.out.println("Edad Inválida");
        return;
        }
        
        if (!validarCorreo(correo)) {
        System.out.println("Correo Inválido");
        return;
        }
        
        if (!validarTelefono(telefono)) {
        System.out.println("Teléfono Inválido");
        return;
        }
        
        if (!validarPassword(password)) {
        System.out.println("Contraseña Inválida");
        return;
        }
        
        double descuento = calcularDescuento(edad);
        double envio = calcularCostoEnvio(ciudad);
        
        System.out.println("\nREGISTRO EXITOSO");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Descuento: " + (descuento * 100) + "%");
        System.out.println("Costo de envío: $" + envio);
        }
    
        public static void mostrarMenu() {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Salir");
            System.out.print("Opción: ");
        }
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int opcion;
            do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
            case 1:
            registrarUsuario(sc);
            break;
            case 2:
            System.out.println("Saliendo...");
            break;
            
            default:
                
            System.out.println("Opción inválida");
            }
            } while (opcion != 2);
            sc.close();
            
        } 
}