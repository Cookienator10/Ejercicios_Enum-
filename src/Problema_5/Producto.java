package Problema_5;

import Problema_1.Vestuario;

public enum Producto {
    LAPIZ("nombre", "descripcion"),
    CUADERNO("nombre", "descripcion"),
    BORRADOR("nombre", "descripcion"),
    SACAPUNTA("nombre", "descripcion"),
    CARTUCHERA("nombre", "descripcion");

    Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String nombre;
    public String descripcion;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String mostrarUso() {
        String uso = getNombre() + " " + getDescripcion();
        return uso;
    }

    public class usar {
        public static void main(String[] args) {
            Producto usar = Producto.LAPIZ;
            System.out.println(usar.mostrarUso());

            Producto usar2 = Producto.CUADERNO;
            System.out.println(usar2.mostrarUso());

            Producto usar3 = Producto.BORRADOR;
            System.out.println(usar3.mostrarUso());

            Producto usar4 = Producto.SACAPUNTA;
            System.out.println(usar4.mostrarUso());

            Producto usar5 = Producto.CARTUCHERA;
            System.out.println(usar5.mostrarUso());


        }
    }
}