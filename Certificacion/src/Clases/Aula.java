package Clases;
// Generated 20/10/2018 01:21:38 by Hibernate Tools 4.3.1



/**
 * Aula generated by hbm2java
 */
public class Aula  implements java.io.Serializable {


     private Integer idAula;
     private String capacidad;

    public Aula() {
    }

    public Aula(String capacidad) {
       this.capacidad = capacidad;
    }
   
    public Integer getIdAula() {
        return this.idAula;
    }
    
    public void setIdAula(Integer idAula) {
        this.idAula = idAula;
    }
    public String getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }




}


