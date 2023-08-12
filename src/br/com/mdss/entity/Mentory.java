package br.com.mdss.entity;

import java.time.LocalDate;

public class Mentory extends Content{

    private LocalDate date;

    public Mentory() {
        super();
    }


    @Override
    public double calcXP() {
        return XP_PARTNER + 20.0;
    }



    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentory => " +
                "title: " + getTitle() +
                ", description: " + getDescription() +
                ", duration: " + date +
                '}';
    }
}
