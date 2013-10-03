package firstproject;

import gui.Login;
import javax.swing.UIManager;

/**
 *
 * @author Mario Jiménez & Osvaldo Barrantes
 */
public class Main {
    static Singleton methodsInstance = Singleton.getInstance();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }
        
        methodsInstance.loadClassrooms();
        methodsInstance.loadClassroomEquipment();
        methodsInstance.loadCourses();
        methodsInstance.loadCoursesSchedules();
        methodsInstance.loadProfessors();
        methodsInstance.loadProfessorsCourses();
        methodsInstance.loadSemesters();
        methodsInstance.loadSemestersCourses();
        
        new Login().show(true);
        
    }
}
