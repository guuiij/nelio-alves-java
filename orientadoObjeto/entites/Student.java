package nelioAlves.orientadoObjeto.entites;


public class Student {
    public String name;
    public double firstGrade;  // VALE 30.
    public double secondGrade;// 35
    public double thirdGrade;

    public double finalGrade() {

        return firstGrade + secondGrade + thirdGrade;

    }
    public  double missingPoint(){
        if (finalGrade() < 60) {
            double pontoRestante = 60 - finalGrade();
            System.out.println("FAILED");
            System.out.println("MISSING " + finalGrade() + " POINTS");

        } else {
            System.out.println("PASS");

        } return finalGrade();
    }


    public  String toString(){
        return "FINAL GRADE: "
                + finalGrade() +" \n"+ missingPoint();
    }
}
