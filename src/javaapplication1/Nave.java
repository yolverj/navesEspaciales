package javaapplication1;

public abstract class Nave {
    private String nombreNave;
    private Integer tipoNave;
    private Integer tipoCombustible;
    private Double velocidad;
    private Double potencia;
    private Double peso;

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombreNave() {
        return nombreNave;
    }

    public void setNombreNave(String nombreNave) {
        this.nombreNave = nombreNave;
    }

    public Integer getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(Integer tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public Double getPotencia() {
        return potencia;
    }

    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }
    
    public Integer getTipoNave() {
        return tipoNave;
    }

    public void setTipoNave(Integer tipoNave) {
        this.tipoNave = tipoNave;
    }
     
    public abstract void crearNave();
    public abstract void operacion();
}
