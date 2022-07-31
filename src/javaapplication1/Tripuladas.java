
package javaapplication1;


public class Tripuladas extends Nave implements consulta{
    
    private Integer numeroPersonas;

    public Integer getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(Integer numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
    
    
    public Tripuladas() {
    }
    
    public Tripuladas(String nombreNave, Integer tipoNave, Integer tipoCombustible, Double velocidad, Double potencia, Double peso){
        this.setNombreNave(nombreNave);
        this.setTipoNave(tipoNave);
        this.setTipoCombustible(tipoCombustible);
        this.setVelocidad(velocidad);
        this.setPotencia(potencia);
        this.setPeso(peso);
    }

    @Override
    public void crearNave() {
        System.out.println("Se ha creado una nave tipo tripulada de manera exitosa");
    }

    @Override
    public void operacion() {
        System.out.println("Como su nombre lo indica, tu nave esta diseñanda para llevar tripulacion al espacio exterior y realizar misiones de mantenimiento, experimentos, acoples, entre otros."
                           );
    }

    @Override
    public String infoNave(String nombreNave) {
        return "SELECT * FROM inventarioNaves WHERE nombre = " + nombreNave;
    }
    
}
