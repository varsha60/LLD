package designpatterns.registry;

import java.util.HashMap;

public class StudentRegistry {

    //This HashMap will store the mapping of student prototypes(template objects) for each batch.
    private HashMap<String, Student> studentRegistry = new HashMap<>();

    public StudentRegistry() {
        this.studentRegistry = new HashMap<>();
    }

    public void add(Student studentPrototype) {
        studentRegistry.put(studentPrototype.getBatchName(),studentPrototype);
    }

    public Student get(String batchName) {
        return studentRegistry.get(batchName);
    }

    public void remove(String batchName) {
        studentRegistry.remove(batchName);
    }
}
