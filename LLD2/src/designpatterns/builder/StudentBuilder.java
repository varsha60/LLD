package designpatterns.builder;


public class StudentBuilder {

    private int age;
    private String name;
    private int gradYear;
    private int psp;
    private String phoneNumber;

    public StudentBuilder(int age, String name, int gradYear, int psp, String phoneNumber) {
        this.age = age;
        this.name = name;
        this.gradYear = gradYear;
        this.psp = psp;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "StudentBuilder{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static Builder builder () {
        return new Builder();
    }

    public static class Builder {

        private int age;
        private String name;
        private int gradYear;
        private int psp;
        private String phoneNumber;

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder psp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        private void validate () {

            if (this.gradYear > 2023 ) {
                throw new GradYearException();
            }

            if (name == null || name.isEmpty() ) {
                throw new InvalidStudentNameException();
            }
        }

        public StudentBuilder build() {
            validate();
            return new StudentBuilder(this.age, this.name, this.gradYear, this.psp, this.phoneNumber);
        }
    }
}
