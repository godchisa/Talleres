public class Linea {
    /**
     * Definicion de los parametros de la clase.
     */
    private double x1, y1, vx1, vy1, x2, y2, vx2, vy2;
    /**
     * Constructor.
     * @param x1 ---> Coordenada x1 de la linea.
     * @param y1 ---> Coordenada y1 de la linea.
     * @param vx1 --> Velocidad de la coordenada x1 de la linea.
     * @param vy1 --> Velocidad de la coordenada xy de la linea.
     * @param x2 ---> Coordenada x2 de la linea.
     * @param y2 ---> Coordenada y2 de la linea.
     * @param vx2 --> Velocidad de la coordenada x2 de la linea.
     * @param vy2 --> Velocidad de la coordenada y2 de la linea.
     */
    public Linea(double x1, double y1, double vx1, double vy1, double x2, double y2, double vx2, double vy2) {
        this.x1 = x1;
        this.y1 = y1;
        this.vx1 = vx1;
        this.vy1 = vy1;
        this.x2 = x2;
        this.y2 = y2;
        this.vx2 = vx2;
        this.vy2 = vy2;
    }
    /**
     * Metodo para el movimiento de las lineas.
     */
    public void mov_linea(double max) {
        if (Math.abs(x1 + vx1) > max) {
            vx1 = -vx1;
        }
        if (Math.abs(y1 + vy1) > max) {
            vy1 = -vy1;
        }
        if (Math.abs(x2 + vx2) > max) {
            vx2 = -vx2;
        }
        if (Math.abs(y2 + vy2) > max) {
            vy2 = -vy2;
        }
        x1 += vx1;
        y1 += vy1;
        x2 += vx2;
        y2 += vy2;
    }
    /**
     * Metodos para obtener la coordenada actualizada de la linea y asi crear la ilusion del movimiento.
     */
    public double devolver_x1() {
        return x1;    }
    public double devolver_y1() {
        return y1;
    }
    public double devolver_vx1() {
        return vx1;
    }
    public double devolver_vy1() {
        return vy1;
    }
    public double devolver_x2() {
        return x2;
    }
    public double devolver_y2() {
        return y2;
    }
    public double devolver_vx2() {
        return vx2;
    }
    public double devolver_vy2() {
        return vy2;
    }
}
