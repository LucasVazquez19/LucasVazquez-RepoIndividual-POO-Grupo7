package Uva2.Ejercicio1;

public class Televisor {
    private String marca;
    private String modelo;
    private int anioDeFabricacion;
    private tipoDeTelevisor tipoDeTelevisor; // p = plasma, l = LCD , o = OlED
    private int pulgadas;
    private String resolucion;
    private boolean inteligente;
    private boolean estaPrendido;

    public enum tipoDeTelevisor{
        p, l, o;
    }
    public Televisor(String marca, String modelo, int anioDeFabricacion, tipoDeTelevisor tipoDeTelevisor,
                     int pulgadas, String resolucion, boolean inteligente) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioDeFabricacion = anioDeFabricacion;
        this.tipoDeTelevisor = tipoDeTelevisor;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.inteligente = inteligente;
        this.estaPrendido = false;  // El televisor por default arranca apagado
    }
    @Override
    public String toString() {
        return
                " -Marca: " + marca +
                "\n -Modelo: " + modelo +
                "\n -Año de fabricacion: " + anioDeFabricacion +
                "\n -Tipo de televisor: " + tipoDeTelevisor +
                "\n -Pulgadas: " + pulgadas +
                "\n -Resolucion: " + resolucion +
                "\n -Es inteligente? " + inteligente +
                "\n -Esta prendido? " + estaPrendido;

    }
    public boolean estaPrendido() {
        return estaPrendido;  // metodo para consultar si esta prendido o apagado
    }

    public void prenderTelevision(){
        if(!estaPrendido()){
            estaPrendido = true;
        }else{
            System.out.println("El televisor esta prendido");
        }
    }
    public void apagarTelevision(){
        if(estaPrendido()){
            estaPrendido = false;
        }else{
            System.out.println("El televisor esta apagado");
        }
    }
}
