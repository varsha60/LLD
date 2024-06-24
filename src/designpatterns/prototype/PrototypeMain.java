package designpatterns.prototype;

public class PrototypeMain {

    public static void main(String[] args) {

        Student student1 = new Student("2023","batchA","lld","sandeep","tts","10june2023","20june2024");
        Student student2 = student1.clone();
        student2.setEmail("varshasawlani@gmail.com");
        student2.setName("varsha");
        student2.setPhoneNumber("565786899");

        System.out.println("Student 1: "+student1);
        System.out.println("Student 2:"+student2);

    }
}
