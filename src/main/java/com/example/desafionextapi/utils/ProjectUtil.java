package com.example.desafionextapi.utils;
import com.example.desafionextapi.entities.Project;
import java.util.List;

public class ProjectUtil {

    public static boolean isProjectValid(Long id, List<Project> projects) {
        for (int i = 0; i < projects.size(); i++) {
            if (projects.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }
}
