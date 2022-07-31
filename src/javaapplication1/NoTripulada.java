
package javaapplication1;

public class NoTripulada extends Nave implements consulta{

    public NoTripulada() {
    }
    
    public NoTripulada(String nombreNave, Integer tipoNave, Integer tipoCombustible, Double velocidad, Double potencia, Double peso){
        this.setNombreNave(nombreNave);
        this.setTipoNave(tipoNave);
        this.setTipoCombustible(tipoCombustible);
        this.setVelocidad(velocidad);
        this.setPotencia(potencia);
        this.setPeso(peso);
    }

    @Override
    public void crearNave() {
        System.out.println("Se ha creado una nave tipo no tripulada de manera exitosa");
    }

    @Override
    public void operacion() {
        System.out.println("Tu tipo de nave esta diseñada para que quede en orbita con los cuerpos celestes, e incluso, aterrizar en los mismos si es posible. Se han realizado misiones en el pasado con exitos y fracasos, espero tu nave llegue con exito a su destino.");
    }

    @Override
    public String infoNave(String nombreNave) {
        return "SELECT * FROM inventarioNaves WHERE nombre = " + nombreNave;
    }
    
}
