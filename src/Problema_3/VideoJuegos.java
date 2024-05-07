package Problema_3;

interface Tienda {


    public enum VideoJuegos implements Tienda {
        DEPORTIVOS("nombredelVideojuego", "comosejuega", "añodecreacion"),
        ESTRATEGIA("nombredelVideojuego", "comosejuega", "añodecreacion"),
        MUSICALES("nombredelVideojuego", "comosejuega", "añodecreacion"),
        AVENTURA("nombredelVideojuego", "comosejuega", "añodecreacion"),
        SIMULACION("nombredelVideojuego", "comosejuega", "añodecreacion");

        VideoJuegos(String nombredelVideojuego, String comosejuega, String añodecreacion) {
            this.nombredelVideojuego = nombredelVideojuego;
            this.comosejuega = comosejuega;
            this.añodecreacion = añodecreacion;
        }

        public String nombredelVideojuego;
        public String comosejuega;
        public String añodecreacion;

        public String getNombredelVideojuego() {
            return nombredelVideojuego;
        }

        public String getComosejuega() {
            return comosejuega;
        }

        public String getAñodecreacion() {
            return añodecreacion;
        }


        public String mostrarPosiciónRanking() {
            String Descripcion = getNombredelVideojuego() + getComosejuega() + getAñodecreacion();
            return Descripcion;
        }

        public String mostrarComprarMonedas() {
            String Descripcion = getNombredelVideojuego() + getComosejuega() + getAñodecreacion();
            return Descripcion;
        }

        public class Servicio {
            public static void main(String[] args) {
                VideoJuegos juego = VideoJuegos.DEPORTIVOS;
                System.out.println(juego.mostrarPosiciónRanking());

                VideoJuegos juego2 = VideoJuegos.ESTRATEGIA;
                System.out.println(juego2.mostrarPosiciónRanking());

                VideoJuegos juego3 = VideoJuegos.MUSICALES;
                System.out.println(juego3.mostrarPosiciónRanking());

                VideoJuegos juego4 = VideoJuegos.DEPORTIVOS;
                System.out.println(juego4.mostrarPosiciónRanking());

                VideoJuegos juego5 = VideoJuegos.SIMULACION;
                System.out.println(juego5.mostrarPosiciónRanking());
            }

            public class Monedas {
                public static void main(String[] args) {
                    VideoJuegos Moneda = VideoJuegos.DEPORTIVOS;
                    System.out.println(Moneda.mostrarComprarMonedas());

                    VideoJuegos Moneda2 = VideoJuegos.ESTRATEGIA;
                    System.out.println(Moneda2.mostrarComprarMonedas());

                    VideoJuegos Moneda3 = VideoJuegos.MUSICALES;
                    System.out.println(Moneda3.mostrarComprarMonedas());

                    VideoJuegos Moneda4 = VideoJuegos.DEPORTIVOS;
                    System.out.println(Moneda4.mostrarComprarMonedas());

                    VideoJuegos Moneda5 = VideoJuegos.SIMULACION;
                    System.out.println(Moneda5.mostrarComprarMonedas());
                }
            }

        }
    }
}


