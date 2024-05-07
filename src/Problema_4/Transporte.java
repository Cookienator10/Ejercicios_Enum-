package Problema_4;

import Problema_1.Vestuario;

public enum Transporte {
    BUS("capacidsd", "tipo_de_motor"),
    TREN("capacidsd", "tipo_de_motor"),
    BARCO("capacidsd", "tipo_de_motor"),
    MOTO("capacidsd", "tipo_de_motor"),
    AVION("capacidsd", "tipo_de_motor");

    Transporte(String capacidad, String tipodetransporte) {
        this.capacidad = capacidad;
        this.tipodetransporte = tipodetransporte;
    }

    public String capacidad;
    public String tipodetransporte;

    public String getCapacidad() {
        return capacidad;
    }

    public String getTipodetransporte() {
        return tipodetransporte;
    }

    public String mostrarDescripcion() {
        String descripcion = getCapacidad() + getTipodetransporte();
        return descripcion;
    }

    public class medio {
        public static void main(String[] args) {
            Transporte medio = Transporte.BUS;
            System.out.println(medio.mostrarDescripcion());

            Transporte medio2 = Transporte.BUS;
            System.out.println(medio2.mostrarDescripcion());

            Transporte medio3 = Transporte.BUS;
            System.out.println(medio3.mostrarDescripcion());

            Transporte medio4= Transporte.BUS;
            System.out.println(medio4.mostrarDescripcion());
        }

    }
}

