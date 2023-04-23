package org.example;

public class Circulo implements Figura{

    private double PI = 3.1416;
    private double radio;

    @Override
    public String toString() {
        return "Circulo{" +
                "PI=" + PI +
                ", radio=" + radio +
                '}';
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo() {
        this.PI = PI;
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return this.PI * this.radio * this.radio;
    }
}
