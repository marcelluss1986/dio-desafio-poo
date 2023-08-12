package br.com.mdss.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private LocalDate initialDate = LocalDate.now();
    private LocalDate finalDate = initialDate.plusDays(45);

    private Set<Dev> enrollDev = new HashSet<>();

    private Set<Content> contents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
    }

    public Set<Dev> getEnrollDev() {
        return enrollDev;
    }

    public Set<Content> getContents() {
        return contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(getName(), bootcamp.getName()) && Objects.equals(getDescription(), bootcamp.getDescription()) && Objects.equals(getInitialDate(), bootcamp.getInitialDate()) && Objects.equals(getFinalDate(), bootcamp.getFinalDate()) && Objects.equals(getEnrollDev(), bootcamp.getEnrollDev()) && Objects.equals(getContents(), bootcamp.getContents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription(), getInitialDate(), getFinalDate(), getEnrollDev(), getContents());
    }
}
