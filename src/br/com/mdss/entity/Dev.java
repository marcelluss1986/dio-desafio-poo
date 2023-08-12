package br.com.mdss.entity;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> enrolledContent = new LinkedHashSet<>();
    private Set<Content> completedContent = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getEnrolledContent() {
        return enrolledContent;
    }

    public Set<Content> getCompletedContent() {
        return completedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(getName(), dev.getName()) && Objects.equals(getEnrolledContent(), dev.getEnrolledContent()) && Objects.equals(getCompletedContent(), dev.getCompletedContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEnrolledContent(), getCompletedContent());
    }

    public void enrollBootcamp (Bootcamp bootcamp){
        this.enrolledContent.addAll(bootcamp.getContents());
        bootcamp.getEnrollDev().add(this);
    }

    public void toProgress(){
        Optional<Content> firstContent = this.enrolledContent.stream().findFirst();
        if(firstContent.isPresent()){
            this.completedContent.add(firstContent.get());
            this.enrolledContent.remove(firstContent.get());
        }else{
            System.err.println("You is not enrolled.");
        }
    }

    public Double calcXPTotal(){
        return this.completedContent.stream().mapToDouble(content -> content.calcXP()).sum();
    }
}
