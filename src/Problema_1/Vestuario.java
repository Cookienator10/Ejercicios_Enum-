package Problema_1;

public enum Vestuario {
    BLUSA("nombre", "descripcion" , "numero_restante"),
    JEAN("nombre", "descripcion" , "numero_restante"),
    CAMISETA("nombre", "descripcion" , "numero_restante"),
    CAMISA("nombre", "descripcion" , "numero_restante");

    Vestuario(String nombre, String descripcion, String numero_restante) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numero_restante = numero_restante;
    }

    public String nombre;
    public String descripcion;
    public String numero_restante;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNumero_restante() {
        return numero_restante;
    }

    public String mostrarDescripcionPrenda(){
     String Descripcion = getNombre() + getDescripcion() + getNumero_restante();
       return Descripcion;
    }

    public class Prenda{
        public static void main(String[] args) {
            Vestuario prenda = Vestuario.BLUSA;
System.out.println(prenda.mostrarDescripcionPrenda());

            Vestuario prenda2 = Vestuario.JEAN;
            System.out.println(prenda2.mostrarDescripcionPrenda());
            Vestuario prenda3 = Vestuario.CAMISA;
            System.out.println(prenda3.mostrarDescripcionPrenda());

            Vestuario prenda4 = Vestuario.CAMISETA;
            System.out.println(prenda4.mostrarDescripcionPrenda());

        }
    }
}

