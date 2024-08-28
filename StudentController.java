package syksy24.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import syksy24.backend.domain.Student;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String getStudentList(Model model) {
        
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nico", "Pekkanen"));
        students.add(new Student("Joona", "Olenius"));
        students.add(new Student("Elia", "Hiltunen"));
        students.add(new Student("Mikko", "Manninen"));

       
        model.addAttribute("students", students);

        
        return "studentlist";
    }
}
