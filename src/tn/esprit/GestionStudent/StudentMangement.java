package tn.esprit.GestionStudent;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentMangement implements Management {
    @Override
    public void displayStudents(List<Student> students, Consumer<Student> con) {

    }

    @Override
    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con) {

    }

    @Override
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun) {
        return null;
    }

    @Override
    public Student createStudent(Supplier<Student> sup) {
        return null;
    }

    @Override
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com) {
        return null;
    }

    @Override
    public Stream<Student> convertToStream(List<Student> students) {
        return null;
    }
}
