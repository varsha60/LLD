package designpatterns.builder;

public class BuilderMain {

    public static void main(String[] args) {

        StudentBuilder s = StudentBuilder.builder()
                .age(23)
                .gradYear(2023)
                .name("varsha")
                .build();

        System.out.println(s);

    }
}
