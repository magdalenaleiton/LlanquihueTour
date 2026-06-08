package app;

import model.Direccion;
import model.Persona;
import model.GuiaTuristico;

public class Main {

    public static void main(String[] args) {

        Direccion dir1 = new Direccion(
                "Av. Costanera 100",
                "Llanquihue",
                "Los Lagos"
        );

        Direccion dir2 = new Direccion(
                "Calle Lago 250",
                "Puerto Varas",
                "Los Lagos"
        );

        Persona cliente = new Persona(
                "12.345.678-9",
                "Juan Perez",
                "987654321",
                dir1
        );

        GuiaTuristico guia = new GuiaTuristico(
                "11.111.111-1",
                "Maria Soto",
                "912345678",
                dir2,
                "Ingles",
                8
        );

        Persona operador = new Persona(
                "22.222.222-2",
                "Pedro Munoz",
                "923456789",
                dir1
        );

        System.out.println("===== CLIENTE =====");
        System.out.println(cliente);

        System.out.println("\n===== GUIA TURISTICO =====");
        System.out.println(guia);

        System.out.println("\n===== OPERADOR =====");
        System.out.println(operador);
    }
}