
package com.mycompany.proyecto01_ipc1a;

import java.util.Random;

/**
 *
 * @author fuent
 */
public class ControladorDeJuego {
    private Mascota mascota;
    private Mascota mascotaEquipo[] = new Mascota[5];
    private Mascota nuevoEquipo[];
    private int posRepetidas[];
    private int cantMascotasFusionar=1;
    private int posMascotaFusionar;
    private int tamañoArregloEquipo;

    //vamos a generar una nueva mascota
    public Mascota generarMascota(){
        Random ran = new Random();
        //num toma valor entre 0 y 53
        int num = ran.nextInt(53);
        //falta generar entre 0 y 10 || 10 y 20 etc de acuerdo a los tiers (rondas)
        switch (num){
            case 0:
                Mascota hormiga = new Mascota("HORMIGA",2,1,"SIN EFECTO","COMPAÑERISMO",0,"INSECTO/TERRESTRE");
                mascota = hormiga;
                break;
            case 1:
                Mascota pescado = new Mascota("PESCADO",2,3,"SIN EFECTO","POWER-UP",0,"ACUÁTICO");
                mascota = pescado;
                break;
            case 2:
                Mascota mosquito = new Mascota("MOSQUITO",2,2,"SIN EFECTO","PIQUETE INICIAL",0,"VOLADOR");
                mascota = mosquito;
                break;
            case 3:
                Mascota grillo = new Mascota("GRILLO",1,2,"SIN EFECTO","ZOMBIFICACION",0,"INSECTO");
                mascota = grillo;
                break;
            case 4:
                Mascota castor = new Mascota("CASTOR",2,2,"SIN EFECTO","REPRESA",0,"TERRESTRE/ACUÁTICO");
                mascota = castor;
                break;
            case 5:
                Mascota caballo = new Mascota("CABALLO",2,1,"SIN EFECTO","RUGIDO ALIADO",0,"MAMÍFERO/DOMÉSTICO");
                mascota = caballo;
                break;
            case 6:
                Mascota nutria = new Mascota("NUTRIA",1,2,"SIN EFECTO","VENTAJA ECONÓMICA",0,"MAMÍFERO");
                mascota = nutria;
                break;
            case 7:
                Mascota escarabajo = new Mascota("ESCARABAJO",2,3,"SIN EFECTO","APETITO",0,"INSECTO");
                mascota = escarabajo;
                break;
            case 8:
                Mascota sapo = new Mascota("SAPO",3,3,"SIN EFECTO","METAMORFOSIS",0,"TERRESTRE/ACUÁTICO");
                mascota = sapo;
                break;
            case 9:
                Mascota dodo = new Mascota("DODO",2,3,"SIN EFECTO","DIVISION DE PODER",0,"VOLADOR");
                mascota = dodo;
                break;
            case 10:
                Mascota elefante = new Mascota("ELEFANTE",3,5,"SIN EFECTO","DAÑO COLATERAL",0,"MAMÍFERO/TERRESTRE");
                mascota = elefante;
                break;
            case 11:
                Mascota puercoespin = new Mascota("PUERCO ESPIN",3,2,"SIN EFECTO","ESPINAS SALVAJES",0,"SOLITARIO/TERRESTRE");
                mascota = puercoespin;
                break;
            case 12:
                Mascota pavoreal = new Mascota("PAVOREAL",2,5,"SIN EFECTO","POTENCIACIÓN",0,"DOMÉSTICO Y VOLADOR");
                mascota = pavoreal;
                break;
            case 13:
                Mascota rata = new Mascota("RATA",4,5,"SIN EFECTO","AYUDA HIPÓCRITA",0,"TERRESTRE Y SOLITARIO");
                mascota = rata;
                break;
            case 14:
                Mascota zorro = new Mascota("ZORRO",5,2,"SIN EFECTO","ATAQUE RÁPIDO",0,"SOLITARIO/TERRESTRE");
                mascota = zorro;
                break;
            case 15:
                Mascota araña = new Mascota("ARAÑA",2,2,"SIN EFECTO","LIBERACIÓN",0,"INSECTO");
                mascota = araña;
                break;
            case 16:
                Mascota camello = new Mascota("CAMELLO",2,5,"SIN EFECTO","JOROBA",0,"MAMÍFERO/DESÉRTICO");
                mascota = camello;
                break;
            case 17:
                Mascota mapache = new Mascota("MAPACHE",5,4,"SIN EFECTO","REPARTIR PODER",0,"SOLITARIO");
                mascota = mapache;
                break;
            case 18:
                Mascota jirafa = new Mascota("JIRAFA",2,5,"SIN EFECTO","FORTALEZA ALIADA",0,"MAMÍFERO/TERRESTRE");
                mascota = jirafa;
                break;
            case 19:
                Mascota tortuga = new Mascota("TORTUGA",1,2,"SIN EFECTO","PROTECCIÓN ALIADA",0,"REPTIL");
                mascota = tortuga;
                break;
            case 20:
                Mascota caracol = new Mascota("CARACOL",2,2,"SIN EFECTO","RESURGIR",0,"INSECTO/SOLITARIO");
                mascota = caracol;
                break;
            case 21:
                Mascota oveja = new Mascota("OVEJA",2,2,"SIN EFECTO","REVOLUCIÓN",0,"DOMÉSTICO/TERRESTRE");
                mascota = oveja;
                break;
            case 22:
                Mascota conejo = new Mascota("CONEJO",3,2,"SIN EFECTO","CARIÑO",0,"ACUÁTICO");
                mascota = conejo;
                break;
            case 23:
                Mascota lobo = new Mascota("LOBO",3,4,"SIN EFECTO","AULLIDO",0,"SOLITRIO/TERRESTRE");
                mascota = lobo;
                break;
            case 24:
                Mascota buey = new Mascota("BUEY",1,4,"SIN EFECTO","MEJOR ME PROTEJO",0,"MAMÍFERO");
                mascota = buey;
                break;
            case 25:
                Mascota canguro = new Mascota("CANGURO",1,2,"SIN EFECTO","YA QUIERO PELEAR",0,"MAMÍFERO/TERRESTRE");
                mascota = canguro;
                break;
            case 26:
                Mascota buho = new Mascota("BUHO",5,3,"SIN EFECTO","SUERTE AMIGOS",0,"VOLADOR/SOLITARIO");
                mascota = buho;
                break;
            case 27:
                Mascota venado = new Mascota("VENADO",1,1,"SIN EFECTO","VENGANZA",0,"MAMÍFERO");
                mascota = venado;
                break;
            case 28:
                Mascota loro = new Mascota("LORO",5,3,"SIN EFECTO","COPIA",0,"VOLADOR");
                mascota = loro;
                break;
            case 29:
                Mascota hipopotamo = new Mascota("HIPOPOTAMO",4,7,"SIN EFECTO","ROBUSTEZ",0,"ACUÁTICO/TERRESTRE");
                mascota = hipopotamo;
                break;
            case 30:
                Mascota delfin = new Mascota("DELFÍN",4,6,"SIN EFECTO","SALPICÓN",0,"ACUÁTICO");
                mascota = delfin;
                break;
            case 31:
                Mascota puma = new Mascota("PUMA",3,7,"SIN EFECTO","SIGILO",0,"MAMÍFERO/TERRESTRE");
                mascota = puma;
                break;
            case 32:
                Mascota ballena = new Mascota("BALLENA",3,8,"SIN EFECTO","SUCCIÓN",0,"ACUÁTICO");
                mascota = ballena;
                break;
            case 33:
                Mascota ardilla = new Mascota("ARDILLA",2,5,"SIN EFECTO","REBAJAS",0,"DOMÉSTICO");
                mascota = ardilla;
                break;
            case 34:
                Mascota llama = new Mascota("LLAMA",3,6,"SIN EFECTO","FORTALEZA INDIVIDUAL",0,"TERRESTRE");
                mascota = llama;
                break;
            case 35:
                Mascota foca = new Mascota("FOCA",3,8,"SIN EFECTO","COMPARTIR PODER",0,"ACUÁTICO/MAMÍFERO");
                mascota = foca;
                break;
            case 36:
                Mascota jaguar = new Mascota("JAGUAR",7,4,"SIN EFECTO","VENGANZA FELINA",0,"MAMÍFERO/TERRESTRE");
                mascota = jaguar;
                break;
            case 37:
                Mascota escorpion = new Mascota("ESCORPION",1,1,"SIN EFECTO","AGUJA",0,"DESÉRTICO/SOLITARIO");
                mascota = escorpion;
                break;
            case 38:
                Mascota rinoceronte = new Mascota("RINOCERONTE",5,8,"SIN EFECTO","ESTAMPIDA",0,"DESÉRTICO/TERRESTRE");
                mascota = rinoceronte;
                break;
            case 39:
                Mascota mono = new Mascota("MONO",1,2,"SIN EFECTO","AMISTAD",0,"MAMÍFERO");
                mascota = mono;
                break;
            case 40:
                Mascota cocodrilo = new Mascota("COCODRILO",8,4,"SIN EFECTO","MORDIDA",0,"REPTIL/SOLITARIO");
                mascota = cocodrilo;
                break;
            case 41:
                Mascota vaca = new Mascota("VACA",4,6,"SIN EFECTO","LECHE POTENCIADORA",0,"MAMÍFERO/TERRESTRE");
                mascota = vaca;
                break;
            case 42:
                Mascota chompipe = new Mascota("CHOMPIPE",3,4,"SIN EFECTO","SOLIDARIDAD",0,"TERRESTRE/VOLADOR");
                mascota = chompipe;
                break;
            case 43:
                Mascota panda = new Mascota("PANDA",5,5,"SIN EFECTO","FORTALEZA",0,"MAMÍFERO/SOLITARIO");
                mascota = panda;
                break;
            case 44:
                Mascota gato = new Mascota("GATO",4,5,"SIN EFECTO","MAULLIDO",0,"MAMÍFERO/DOMÉSTICO");
                mascota = gato;
                break;
            case 45:
                Mascota tigre = new Mascota("TIGRE",4,3,"SIN EFECTO","REPETICIÓN",0,"TERRESTRE/MAMÍFERO");
                mascota = tigre;
                break;
            case 46:
                Mascota serpiente = new Mascota("SERPIENTE",6,6,"SIN EFECTO","ATAQUE DESÉRTICO",0,"REPTIL/TERRESTRE/DESÉRTICO");
                mascota = serpiente;
                break;
            case 47:
                Mascota mamut = new Mascota("MAMUT",3,10,"SIN EFECTO","FUERZA COMPAÑEROS",0,"MAMÍFERO/TERRESTRE/SOLITARIO");
                return mamut;
            case 48:
                Mascota leopardo = new Mascota("LEOPARDO",10,4,"SIN EFECTO","ZARPAZO",0,"MAMÍFERO/TERRESTRE");
                mascota = leopardo;
                break;
            case 49:
                Mascota gorila = new Mascota("GORILA",6,9,"SIN EFECTO","ESCUDO",0,"MAMÍFERO/TERRESTRE");
                mascota = gorila;
                break;
            case 50:
                Mascota pulpo = new Mascota("PULPO",8,8,"SIN EFECTO","OBTIENE HABILIDADES AL SUBIR DE NIVELES",0,"ACUÁTICO/SOLITARIO");
                mascota = pulpo;
                break;
            case 51:
                Mascota mosca = new Mascota("MOSCA",5,5,"SIN EFECTO","INVOCACIÓN",0,"VOLADOR/INSECTO");
                mascota = mosca;
                break;
            case 52:
                Mascota quetzal = new Mascota("QUETZAL",10,10,"SIN EFECTO","OBTIENE HABILIDADES AL SUBIR DE NIVELES",0,"VOLADOR/SOLITARIO");
                mascota = quetzal;
                break;
            case 53:
                Mascota camaleon = new Mascota("CAMALEON",8,8,"SIN EFECTO","OBTIENE HABILIDADES AL SUBIR DE NIVELES",0,"REPTIL/SOLITARIO");
                mascota = camaleon;
                break;
        }
        return mascota;
    }
    //Aquí se crea el equipo (arreglo) de jugador y enemigo
    //el arreglo debe ser del tamaño de 3 si la ronda es = 1
    //si la ronda es >= 2 ya puede ser de 5
    
    
    //aqui en este metodo se va a generar una comida aleatoria de acuerdo al tier
    //va a recibir como parámetro un int llamado tier
    public Comida generarComida(int tier){
        private Comida comida;
        Random ranComida = new Random();
        int n = ranComida.nextInt(tier);
        switch(n){
            case 0:
                Comida Manzana = new Comida("Manzana",false,1,1);
                comida = Manzana;
        }
        
        return comida;
    }
    
    
    
    public void generarEquipo(int cantRondas){
        int i=0;
        if (cantRondas==1) {
            tamañoArregloEquipo=3;
        }
        else{
            tamañoArregloEquipo=5;
        }
        for (i = 0; i < tamañoArregloEquipo; i++) {
            mascotaEquipo[i] = generarMascota();
            System.out.println(mascotaEquipo[i].mostrarMascotas());
            System.out.println("");
        }
    }
    //añadir esto en pelea para ver si hay o no fusiones disponibles
    //Este método nos dice solamente si hay fusiones disponibles o no
    private boolean comprobarFusion(){
        int m=0;
        for (int i = 0; i < nuevoEquipo.length; i++) {
            if (mascotaEquipo[i] != null) {
                nuevoEquipo[i] = mascotaEquipo[i];
            }
        }
        for (int i = 0; i < nuevoEquipo.length; i++) {
            String nom = nuevoEquipo[i].getNombreMascota();
            nuevoEquipo[i].setNombreMascota(null);
            posRepetidas[m] = i;
            for (int j = 0; j < nuevoEquipo.length; j++) {
                if (nom.equalsIgnoreCase(nuevoEquipo[j].getNombreMascota())) {
                    cantMascotasFusionar++;
                    m++;
                    posRepetidas[m]=j;
                }
            }
            nuevoEquipo[i].setNombreMascota(nom);
        }
        for (int l = 0; l < cantMascotasFusionar; l++) {
            mascotaEquipo[posRepetidas[l]].setNombreMascota(null);
        }
        
        
        if (cantMascotasFusionar>1) {
                return true;
        }
        return false;
    }
    //Este método nos devuelve el nombre de la mascota que tiene disponible una fusion
    private String darNombreDeMascotaFusion(){
        if (cantMascotasFusionar>0) {
            return mascotaEquipo[posMascotaFusionar].getNombreMascota();
        }
        return null;
    }
    
    // este método debe devolver la nueva mascota con su nueva vida y ataque
    public Mascota fusionarMascotas (Mascota masc){
        int i=0;
        int nuevaExp=0;
        int nuevaVida=0;
        int nuevoDaño=0;
        while(i<cantMascotasFusionar){
            if (cantMascotasFusionar==1) {
                nuevaExp = masc.getExperiencia()+masc.getExperiencia();
            }
            else if (cantMascotasFusionar==2) {
                nuevaExp = masc.getExperiencia()+masc.getExperiencia()+masc.getExperiencia();
            }
            else if (cantMascotasFusionar==3) {
                nuevaExp = masc.getExperiencia()+masc.getExperiencia()+masc.getExperiencia();
            }
            
            nuevaVida = masc.getUnidadDeVida()+1;
            nuevoDaño = masc.getUnidadDeDaño()+1;
 
        }
        
        
        
        
        return null;
    }
    
    public void mostrarMenu(){
        //aqui va el equipo de 3 mascotas para comprar
        // y los efectos
        //generamos un arreglo tipo mascota y uno tipo 
        Mascota equipoMascotaTienda[] = new Mascota[3];
        
    }
}
