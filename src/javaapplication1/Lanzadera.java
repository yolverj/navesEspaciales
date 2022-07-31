
package javaapplication1;

public class Lanzadera extends Nave implements consulta{
    
    public Lanzadera() {
    }
    
    public Lanzadera(String nombreNave, Integer tipoNave, Integer tipoCombustible, Double velocidad, Double potencia, Double peso){
        this.setNombreNave(nombreNave);
        this.setTipoNave(tipoNave);
        this.setTipoCombustible(tipoCombustible);
        this.setVelocidad(velocidad);
        this.setPotencia(potencia);
        this.setPeso(peso);
    }
        
    @Override
    public void crearNave() {
        System.out.println("Se ha creado una nave tipo lanzadera de manera exitosa");
    }

    @Override
    public void operacion() {
        System.out.println(" Tu nave esta diseñada para lanzar carga util al espacio. Es decir, si tu misión es enviar unsatelite artificial, una sonda o incluso una nave tripulada, este es el tipo de nave para ese cargo.");
    }


    @Override
    public String infoNave(String nombreNave) {
        return "SELECT * FROM inventarioNaves WHERE nombre = " + nombreNave;
    }
}
