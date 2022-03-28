
package com.mycompany.proyecto01_ipc1a;

import java.util.Random;

/**
 *
 * @author fuent
 */
public class Mascota {
    private String nombre;
    private int unidadDeDaño;
    private int unidadDeVida;
    private String efectoActivo;
    private String habilidad;
    private int experiencia;
    private String tipo;
    private int cantRondas;

    public Mascota(String nombre, int unidadDeDaño, int unidadDeVida, String efectoActivo, String habilidad, int experiencia, String tipo) {
        this.nombre = nombre;
        this.unidadDeDaño = unidadDeDaño;
        this.unidadDeVida = unidadDeVida;
        this.efectoActivo = efectoActivo;
        this.habilidad = habilidad;
        this.experiencia = experiencia;
        this.tipo = tipo;
    }
    
    public String mostrarMascotas(){
        return "MASCOTA: "+nombre+"\nUNIDAD DE DAÑO: "+unidadDeDaño+"\nUNIDAD DE VIDA: "+unidadDeVida+
                "\nEFECTO ACTIVO: "+efectoActivo+"\nHABILIDAD: "+habilidad+"\nEXPERIENCIA: "+experiencia+
                "\nTIPO: "+tipo;
    }
    //Generando los Getters
    public String getNombreMascota(){
        return nombre;
    }
    public int getUnidadDeDaño(){
        return unidadDeDaño;
    }
    public int getUnidadDeVida(){
        return unidadDeVida;
    }
    public String getEfectoActivo(){
        return efectoActivo;
    }
    public String getHabilidad(){
        return habilidad;
    }
    public int getExperiencia(){
        return experiencia;
    }
    public String getTipo(){
        return tipo;
    }
    //Generando setters
    public void setNombreMascota(String nom){
        this.nombre = nom;
    }
    
    public String aplicarEfecto(Mascota mascotaAtacada){
        //hay que darle el efecto de la mascota atacante a la mascota atacada
        return "";
    }
    
    public int atacar(Mascota mascotaAtacada){
        return 0;
    }
    
    public Mascota obtenerTipoMascota(){
        Random ran = new Random();
        int num = ran.nextInt(54);
        return null;
        // falta generar todos los tipos de mascota de acuerdo con el random
        // es decir, generar tipos de mascotas random
    }
    
    
    
    
    
}
