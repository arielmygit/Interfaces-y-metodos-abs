package org.example;

import org.example.herenciamultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cuadrado cuadrado = new Cuadrado(5);
        cuadrado.setLado(5);
        System.out.println("Area del cuadrado = "+cuadrado.calcularArea());

        Circulo circ = new Circulo();
        circ.setRadio(2.4);
        System.out.println("Area del circulo = "+circ.calcularArea());

        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Juan");
        ada.setArte("Pintura");
        ada.setDeporte("Basquetball");
        System.out.println(ada);
        ada.ensayar("Oleo");
        ada.entrenar();
        ada.presentarCompetencia("Naucalli");


    }


}