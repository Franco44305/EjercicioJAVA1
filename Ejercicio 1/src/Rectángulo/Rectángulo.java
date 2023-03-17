package Rectángulo;

public class Rectángulo
{
    private int Ancho;
    private int Alto;
    private int Area = ObtenerArea(Alto, Ancho);
    private int Perimetro = ObtenerPerimetro(Alto, Ancho);

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int ancho) {
        Ancho = ancho;
    }

    public int getAlto() {
        return Alto;
    }

    public void setAlto(int alto) {
        Alto = alto;
    }

    public int ObtenerArea(int Alto, int Ancho)
    {
        return (Ancho * Alto);
    }
    public int ObtenerPerimetro(int Alto, int Ancho)
    {
        return (Ancho + Alto);
    }
}
