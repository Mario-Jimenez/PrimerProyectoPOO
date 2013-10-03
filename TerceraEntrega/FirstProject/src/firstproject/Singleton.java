package firstproject;

import entities.Equipment;
import entities.PracticalClassroom;
import entities.PracticalCourse;
import entities.Professor;
import entities.Schedule;
import entities.Semester;
import entities.TheoryClassroom;
import entities.TheoryCourse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import structs.ClassroomList;
import structs.ClassroomNode;
import structs.CourseList;
import structs.CourseNode;
import structs.ProfessorList;
import structs.ProfessorNode;
import structs.SemesterList;
import structs.SemesterNode;

/**
 * This class works as a global instance reference to access
 * all data structures and all the information
 * Also, it loads existing data from text files
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public class Singleton {
    
    /**
     * This is the instance that grants access to all the information
     * and all the structures used by the application
     */
    private static Singleton instance = null;
    private ProfessorList myProfessorList;
    private CourseList myCourseList;
    private ClassroomList myClassroomList;
    private SemesterList mySemesterList;

    /**
     * Constructor
     */
    private Singleton() {
        this.myProfessorList = new ProfessorList();
        this.myCourseList = new CourseList();
        this.myClassroomList = new ClassroomList();
        this.mySemesterList = new SemesterList();
    }
    
    /**
     * Grants access to the GLOBAL singleton instance
     * @return the GLOBAL singleton instance
     * @see Singleton
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Getter
     * @return the professors list
     */
    public ProfessorList getMyProfessorList() {
        return myProfessorList;
    }

    /**
     * Getter
     * @return the courses list
     */
    public CourseList getMyCourseList() {
        return myCourseList;
    }

    /**
     * Getter
     * @return the classrooms list
     */
    public ClassroomList getMyClassroomList() {
        return myClassroomList;
    }

    /**
     * Getter
     * @return the semesters list
     */
    public SemesterList getMySemesterList() {
        return mySemesterList;
    }
    
    /**
     * Loads from a text file information about professors
     */
    public void loadProfessors() {
        String reading;
        int counter;
        String id, name, school;
        try {
            InputStream file = getClass().getResourceAsStream("/files/profesores.txt");
            BufferedReader read = new BufferedReader(new InputStreamReader(file));
            reading = read.readLine();
            counter = Integer.parseInt(reading);
            for (int i = 0; i < counter; i++) {
                id = read.readLine();
                name = read.readLine();
                school = read.readLine();
                myProfessorList.add(new Professor(id, name, school));
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
    
    /**
     * Loads from a text file information about courses
     */
    public void loadCourses() {
        String reading;
        int counter;
        String id, name, webSite, supportMaterial, operatingSystem, type;
        int credits, group;
        boolean exclusive;
        try {
            InputStream file = getClass().getResourceAsStream("/files/cursos.txt");
            BufferedReader read = new BufferedReader(new InputStreamReader(file));
            reading = read.readLine();
            counter = Integer.parseInt(reading);
            for (int i = 0; i < counter; i++) {
                type = read.readLine();
                id = read.readLine();
                name = read.readLine();
                reading = read.readLine();
                credits = Integer.parseInt(reading);
                reading = read.readLine();
                if (reading.compareTo("0") == 0) {
                    exclusive = true;
                } else {
                    exclusive = false;
                }
                reading = read.readLine();
                group = Integer.parseInt(reading);
                if (type.compareToIgnoreCase("Teorico") == 0) {
                    webSite = read.readLine();
                    myCourseList.add(new TheoryCourse(webSite, id, name, credits, exclusive), group);
                } else {
                    supportMaterial = read.readLine();
                    operatingSystem = read.readLine();
                    myCourseList.add(new PracticalCourse(supportMaterial, operatingSystem, id, name, credits, exclusive), group);
                }
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
    
    /**
     * Loads from a text file information about classrooms
     */
    public void loadClassrooms() {
        String reading;
        int counter;
        String id, name, location, type;
        int capacity;
        boolean airConditioning, multimediaEquipment;
        try {
            InputStream file = getClass().getResourceAsStream("/files/aulas.txt");
            BufferedReader read = new BufferedReader(new InputStreamReader(file));
            reading = read.readLine();
            counter = Integer.parseInt(reading);
            for (int i = 0; i < counter; i++) {
                type = read.readLine();
                id = read.readLine();
                name = read.readLine();
                location = read.readLine();
                reading = read.readLine();
                capacity = Integer.parseInt(reading);
                if (type.compareToIgnoreCase("Teorica") == 0) {
                    reading = read.readLine();
                    if (reading.compareTo("0") == 0) {
                        airConditioning = true;
                    } else {
                        airConditioning = false;
                    }
                    reading = read.readLine();
                    if (reading.compareTo("0") == 0) {
                        multimediaEquipment = true;
                    } else {
                        multimediaEquipment = false;
                    }
                    myClassroomList.add(new TheoryClassroom(airConditioning, multimediaEquipment, id, name, location, capacity));
                } else {
                    myClassroomList.add(new PracticalClassroom(id, name, location, capacity));
                }
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
    
    /**
     * loads semesters into the program
     */
    public void loadSemesters() {
        for (int i = 1; i < 9; i++) {
            mySemesterList.add(new Semester(i));
        }
    }
    
    /**
     * Loads from a text file the links between professors
     * and their courses
     */
    public void loadProfessorsCourses() {
        String reading;
        int professorCounter, courseCounter;
        String professorID, courseID;
        int group;
        ProfessorNode professorTemp = null;
        try {
            InputStream file = getClass().getResourceAsStream("/files/profesores_cursos.txt");
            BufferedReader read = new BufferedReader(new InputStreamReader(file));
            reading = read.readLine();
            professorCounter = Integer.parseInt(reading);
            for (int i = 0; i < professorCounter; i++) {
                professorID = read.readLine();
                professorTemp = myProfessorList.search(professorID);
                reading = read.readLine();
                courseCounter = Integer.parseInt(reading);
                for (int j = 0; j < courseCounter; j++) {
                    courseID = read.readLine();
                    reading = read.readLine();
                    group = Integer.parseInt(reading);
                    professorTemp.addCourse(myCourseList.search(courseID, group));
                }
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
    
    /**
     * Loads from a text file the links between courses
     * and their schedules
     */
    public void loadCoursesSchedules() {
        String reading;
        int courseCounter, scheduleCounter;
        String courseID, day, classroomID;
        int group, start, blocks;
        CourseNode courseTemp = null;
        try {
            InputStream file = getClass().getResourceAsStream("/files/cursos_horarios.txt");
            BufferedReader read = new BufferedReader(new InputStreamReader(file));
            reading = read.readLine();
            courseCounter = Integer.parseInt(reading);
            for (int i = 0; i < courseCounter; i++) {
                courseID = read.readLine();
                reading = read.readLine();
                group = Integer.parseInt(reading);
                courseTemp = myCourseList.search(courseID, group);
                reading = read.readLine();
                scheduleCounter = Integer.parseInt(reading);
                for (int j = 0; j < scheduleCounter; j++) {
                    day = read.readLine();
                    reading = read.readLine();
                    start = Integer.parseInt(reading);
                    reading = read.readLine();
                    blocks = Integer.parseInt(reading);
                    classroomID = read.readLine();
                    courseTemp.addSchedule(new Schedule(day, start, blocks), myClassroomList.search(classroomID));
                }
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
    
    /**
     * Loads from a text file the links between semesters
     * and their courses
     */
    public void loadSemestersCourses() {
        String reading;
        int semesterCounter, courseCounter;
        int semesterID, group;
        String courseID;
        SemesterNode semesterTemp = null;
        try {
            InputStream file = getClass().getResourceAsStream("/files/semestres_cursos.txt");
            BufferedReader read = new BufferedReader(new InputStreamReader(file));
            reading = read.readLine();
            semesterCounter = Integer.parseInt(reading);
            for (int i = 0; i < semesterCounter; i++) {
                reading = read.readLine();
                semesterID = Integer.parseInt(reading);
                semesterTemp = mySemesterList.search(semesterID);
                reading = read.readLine();
                courseCounter = Integer.parseInt(reading);
                for (int j = 0; j < courseCounter; j++) {
                    courseID = read.readLine();
                    reading = read.readLine();
                    group = Integer.parseInt(reading);
                    semesterTemp.addCourse(myCourseList.search(courseID, group));
                }
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
    
    /**
     * Loads from a text file the links between practical classrooms
     * and their equipment
     */
    public void loadClassroomEquipment() {
        String reading;
        int classroomCounter, equipmentCounter;
        String classroomID, name;
        int quantity;
        ClassroomNode classroomTemp = null;
        try {
            InputStream file = getClass().getResourceAsStream("/files/aulas_equipos.txt");
            BufferedReader read = new BufferedReader(new InputStreamReader(file));
            reading = read.readLine();
            classroomCounter = Integer.parseInt(reading);
            for (int i = 0; i < classroomCounter; i++) {
                classroomID = read.readLine();
                classroomTemp = myClassroomList.search(classroomID);
                reading = read.readLine();
                equipmentCounter = Integer.parseInt(reading);
                for (int j = 0; j < equipmentCounter; j++) {
                    name = read.readLine();
                    reading = read.readLine();
                    quantity = Integer.parseInt(reading);
                    ((PracticalClassroom)classroomTemp.getInfo()).addEquipment(new Equipment(name, quantity));
                }
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
    
}
