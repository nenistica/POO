public class Main {

    public static void main(String[] args) {
        //Person
        Person persona1 = new Person();
        persona1.setName("Vladimir");
        persona1.setLastName("Castañeda");

        System.out.println("El nombre de la persona es: " + persona1.getName());
        System.out.println("Y el apellido es: " + persona1.getLastName());

        //Student
        Student student1 = new Student();
        student1.setEnrollment(54354);
        student1.setCareer("Arquitectura");

        System.out.println("La inscripción es: " + student1.getEnrollment());
        System.out.println("La carrera es: " + student1.getCareer());

        //Teacher
        Teacher teacher1 = new Teacher();
        teacher1.setArea ("Infraestructura");
        teacher1.setMatter("Planos I");

        System.out.println("El area es: "+teacher1.getArea());
        System.out.println("La materia es: : "+teacher1.getMatter());
    }
}


