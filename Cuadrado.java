package org.example;

public class Cuadrado implements Figura{
    private double lado;

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea(){
        return  this.lado * this.lado;
    }
}
