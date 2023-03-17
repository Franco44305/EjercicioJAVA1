package Punto;

public class Punto
{
    private double x;
    private double y;

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double ObtenerDistancia(Punto punto1, Punto punto2)
    {
        double distancia = Math.sqrt((Math.pow(punto2.x- punto1.x,2) + (Math.pow(punto2.y - punto1.y, 2))));
        return distancia;
    }
}
