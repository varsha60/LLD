package designpatterns.registry;

public class RegistryMain {

    public static void main(String[] args) {

        Student studentPrototypeBatchA = new Student("2023","batchA","lld","sandeep","tts","10june2023","10june2023");
        Student studentPrototypeBatchB = new Student("2023","batchB","lld","sandeep","tts","10june2023","10june2023");
        Student studentPrototypeBatchC = new Student("2023","batchC","lld","sandeep","tts","10june2023","10june2023");

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.add(studentPrototypeBatchA);
        studentRegistry.add(studentPrototypeBatchB);
        studentRegistry.add(studentPrototypeBatchC);

        Student studentBatchA = studentRegistry.get("batchA").clone();
        studentBatchA.setName("varsha");
        Student studentBatchB = studentRegistry.get("batchB").clone();
        studentBatchB.setName("ketan");
        Student studentBatchC = studentRegistry.get("batchC").clone();
        studentBatchC.setName("hiten");

        System.out.println("Student of batch A is: "+studentBatchA);
        System.out.println("Student of batch B is: "+studentBatchB);
        System.out.println("Student of batch C is: "+studentBatchC);





    }
}
