package create.builderMode;

import model.Student;

/**
 * Created by zengjianlu on 2018/2/23.
 */
public class BuilderTest {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        Student student = studentBuilder.name("dada").age(10).address("浦东").build();
        System.out.println(student);
    }
}
