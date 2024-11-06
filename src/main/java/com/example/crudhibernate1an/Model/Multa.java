package com.example.crudhibernate1an.Model;

import javax.persistence.*;
import java.time.LocalDate;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "multas")
public class Multa {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_multa")
    private int id_multa;

    @Column(name = "precio")
    private int precio;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "id_coche")
    private int id_coche;

    @ManyToOne
    @JoinColumn(name = "id_coche", referencedColumnName = "id_coche")
    private Coche coche; //Una multa solo puede tener un coche

    public Multa() {
    }

    public Multa(int precio, LocalDate fecha, int id_coche, Coche coche) {
        this.precio = precio;
        this.fecha = fecha;
        this.id_coche = id_coche;
        this.coche = coche;
    }

    public int getId_multa() {
        return id_multa;
    }

    public void setId_multa(int id_multa) {
        this.id_multa = id_multa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getId_coche() {
        return id_coche;
    }

    public void setId_coche(int id_coche) {
        this.id_coche = id_coche;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "Multa{" +
                "id_multa=" + id_multa +
                ", precio=" + precio +
                ", fecha=" + fecha +
                ", id_coche=" + id_coche +
                ", coche=" + coche +
                '}';
    }
}
