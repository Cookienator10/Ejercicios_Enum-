package Problema_2;

import Problema_1.Vestuario;

public enum ServicioPeluqueria {
    CORTE("Nombre", "descripcion", "precio"),
    UÑAS("nombre", "descripcion", "precio"),
    TINTE("nombre", "descripcion", "precio");

    ServicioPeluqueria(String Nombre, String Descripcion, String Precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String nombre;
    public String descripcion;
    public String precio;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public String mostrarDescripcionServicio() {
        String Descripcion = getNombre() + getDescripcion() + getPrecio();
        return Descripcion;
    }

    public class Servicio {
        public static void main(String[] args) {
            ServicioPeluqueria  servicio = ServicioPeluqueria.CORTE;
            System.out.println(servicio.mostrarDescripcionServicio());

            ServicioPeluqueria servicio2 = ServicioPeluqueria.UÑAS;
            System.out.println(servicio2.mostrarDescripcionServicio());
            ServicioPeluqueria servicio3 = ServicioPeluqueria.TINTE;
            System.out.println(servicio3.mostrarDescripcionServicio());

        }
    }
}



