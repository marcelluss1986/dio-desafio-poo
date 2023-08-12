import br.com.mdss.entity.Bootcamp;
import br.com.mdss.entity.Course;
import br.com.mdss.entity.Dev;
import br.com.mdss.entity.Mentory;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Java");
        course1.setDescription("Java course");
        course1.setDuration(4);

        Course course2 = new Course();
        course2.setTitle("JavaScript");
        course2.setDescription("JavaScript course");
        course2.setDuration(4);

        Mentory mentory1 = new Mentory();
        mentory1.setTitle("Java mentory");
        mentory1.setDescription("Description mentory of java");
        mentory1.setDate(LocalDate.now());


//        System.out.println(course1);
//        System.out.println(course2);
//        System.out.println(mentory1);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Java developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentory1);

        Dev devMarcelo = new Dev();
        devMarcelo.setName("Marcelo");
        devMarcelo.enrollBootcamp(bootcamp);
        System.out.println("Enrolled contents" + devMarcelo.getEnrolledContent());
        System.out.println("=======================");

        devMarcelo.toProgress();
        devMarcelo.toProgress();
        devMarcelo.toProgress();
        System.out.println("Enrolled contents" + devMarcelo.getEnrolledContent());
        System.out.println("Completed contents" + devMarcelo.getCompletedContent());
        System.out.println("Calc XP: " + devMarcelo.calcXPTotal());


        System.out.println("-------------------------");

        Dev devMM = new Dev();
        devMM.setName("MM");
        devMM.enrollBootcamp(bootcamp);
        System.out.println("Enrolled contents" + devMM.getEnrolledContent());

        System.out.println("=======================");

        devMM.toProgress();
        System.out.println("Enrolled contents" + devMM.getEnrolledContent());
        System.out.println("Completed contents" + devMM.getCompletedContent());
        System.out.println("Calc XP: " + devMM.calcXPTotal());





    }
}
