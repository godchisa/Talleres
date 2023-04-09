import edu.princeton.cs.stdlib.StdDraw;

public class Main {

    public static void main(String[] args) {
        /**
         * Variables generales.
         */
        int pausa = 1;                                        //Pausa entre fotogramas (ms) para el metodo pause()
        double vel_ini = Math.random();                        //Velocidad inicial de la linea principal (azul)
        StdDraw.setCanvasSize(700, 700); // Resolucion de la ventana.
        double min = -100.0;
        double max = 100.0;
        StdDraw.setXscale(min, max);
        StdDraw.setYscale(min, max);                           //Escalas de la ventana.

        /**
         * Uso de la clase "Linea" para definir las lineas, la primera linea (L1), es la definida al azar,
         * para despues la siguiente (L2) ocupe sus mismas caracteristicas y por tanto siga su mismo camino,
         * lo mismo se repite para la siguiente linea (L3) y asi sucesivamente.
         */
        Linea L1 = new Linea(Math.random() * 100, Math.random() * 100, vel_ini, vel_ini, Math.random() * 100, Math.random() * 100, vel_ini, vel_ini);
        Linea L2 = new Linea(L1.devolver_x1() - 2, L1.devolver_y1() - 2, L1.devolver_vx1(), L1.devolver_vy1(), L1.devolver_x2()-2, L1.devolver_y2()-2, L1.devolver_vx2(), L1.devolver_vy2());
        Linea L3 = new Linea(L2.devolver_x1() - 2, L2.devolver_y1() - 2, L2.devolver_vx1(), L2.devolver_vy1(), L2.devolver_x2()-2, L2.devolver_y2()-2, L2.devolver_vx2(), L2.devolver_vy2());
        Linea L4 = new Linea(L3.devolver_x1() - 2, L3.devolver_y1() - 2, L3.devolver_vx1(), L3.devolver_vy1(), L3.devolver_x2()-2, L3.devolver_y2()-2, L3.devolver_vx2(), L3.devolver_vy2());
        Linea L5 = new Linea(L4.devolver_x1() - 2, L4.devolver_y1() - 2, L4.devolver_vx1(), L4.devolver_vy1(), L4.devolver_x2()-2, L4.devolver_y2()-2, L4.devolver_vx2(), L4.devolver_vy2());
        Linea L6 = new Linea(L5.devolver_x1() - 2, L5.devolver_y1() - 2, L5.devolver_vx1(), L5.devolver_vy1(), L5.devolver_x2()-2, L5.devolver_y2()-2, L5.devolver_vx2(), L5.devolver_vy2());
        while (true) {

            /**
             * Actualizacion de la posicion de las lineas usando ciclo while y metodos de la clase "Linea".
             */
            L1.mov_linea(100);
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.line(L1.devolver_x1(), L1.devolver_y1(), L1.devolver_x2(), L1.devolver_y2());

            L2.mov_linea(100);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.line(L2.devolver_x1(), L2.devolver_y1(), L2.devolver_x2(), L2.devolver_y2());

            L3.mov_linea(100);
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.line(L3.devolver_x1(), L3.devolver_y1(), L3.devolver_x2(), L3.devolver_y2());

            L4.mov_linea(100);
            StdDraw.setPenColor(StdDraw.ORANGE);
            StdDraw.line(L4.devolver_x1(), L4.devolver_y1(), L4.devolver_x2(), L4.devolver_y2());

            L5.mov_linea(100);
            StdDraw.setPenColor(StdDraw.MAGENTA);
            StdDraw.line(L5.devolver_x1(), L5.devolver_y1(), L5.devolver_x2(), L5.devolver_y2());

            L6.mov_linea(100);
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.line(L6.devolver_x1(), L6.devolver_y1(), L6.devolver_x2(), L6.devolver_y2());

            StdDraw.enableDoubleBuffering();
            StdDraw.show();
            StdDraw.clear();
            StdDraw.pause(pausa);
        }
    }
}