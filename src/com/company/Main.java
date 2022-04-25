package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Datos Trabajador=new Datos();
    Scanner Traba=new Scanner(System.in);
    String nombre, profesion,añosDeExperiencia,pais;
    System.out.print("ingrese su nombre: ");
    nombre=Traba.next();
    Trabajador.setNombre(nombre);
    System.out.print("ingrese su profesion: ");
    profesion=Traba.next();
    Trabajador.setProfesion(profesion);
    System.out.print("ingrese sus años de experiencia: ");
    añosDeExperiencia=Traba.next();
    Trabajador.setAñosDeExpriencia(añosDeExperiencia);
    System.out.print("ingrese pais: ");
    pais=Traba.next();
    Trabajador.setPais(pais);
    System.out.print("\n........DATOS DEL ASPIRANTE....."+
            "\n NOMBRE: "+Trabajador.getNombre()
            + "\n PROFESION: "+Trabajador.getProfesion()
            + "\n AÑOS DE EXPERIENCIA: "+Trabajador.getAñosDeExpriencia()
            + "\n PAIS: "+Trabajador.getPais());
    }
}
