package br.com.mdss.entity;

public class Course extends Content{

    private int duration;


    @Override
    public double calcXP() {
        return XP_PARTNER * duration ;
    }

    public Course() {
    }

    public Course(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course => " +
                "title: " + getTitle() +
                ", description: " + getDescription() +
                ", duration: " + duration +
                '}';
    }
}
