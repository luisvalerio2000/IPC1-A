/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto01_ipc1a;

/**
 *
 * @author fuent
 */
public class Comida {
    private String nombreComida;
    private boolean tipoEfecto;
    private int daVida;
    private int daDaño;
    
    public Comida(String nombreComida, boolean tipoEfecto, int daVida, int daDaño){
        this.nombreComida = nombreComida;
        this.tipoEfecto = tipoEfecto;
        this.daVida = daVida;
        this.daDaño = daDaño;
    }
    
    public void mostrarComida(){
        System.out.println("Comida: "+nombreComida);
        System.out.println("Tipo Efecto: "+tipoEfecto);
        System.out.println("Vida que añade a mascota: "+daVida);
        System.out.println("Daño que añade a mascota: "+daDaño);
    }
    
}
