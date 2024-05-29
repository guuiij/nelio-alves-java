package nelioAlves.orientadoObjeto.exercicios;

public class Aluno {
    private String name;
    private int age;
    private String course;

    public Aluno() {
    }

    public Aluno(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }


    public void infoAluno() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Course : " + course);
    }

    public boolean statusIdade() {
        return  age>18;
    }


}
