package Projeto;

public class Rotina {
    private String exercicio1;
    private String exercicio2;
    private String exercicio3;
    private String exercicio4;
    private String exercicio5;
 
    public String getExercicio1() {
        return exercicio1;
    }
    public void setExercicio1(String exercicio1) {
        this.exercicio1 = exercicio1;
    }
    public String getExercicio2() {
        return exercicio2;
    }
    public void setExercicio2(String exercicio2) {
        this.exercicio2 = exercicio2;
    }
    public String getExercicio3() {
        return exercicio3;
    }
    public void setExercicio3(String exercicio3) {
        this.exercicio3 = exercicio3;
    }
    public String getExercicio4() {
        return exercicio4;
    }
    public void setExercicio4(String exercicio4) {
        this.exercicio4 = exercicio4;
    }
    public String getExercicio5() {
        return exercicio5;
    }
    public void setExercicio5(String exercicio5) {
        this.exercicio5 = exercicio5;
    }
    @Override
    public String toString() {
        return  "Exerc�cio: " + exercicio1 + "\nExerc�cio: " + exercicio2 + "\nExerc�cio: "
                + exercicio3 + "\nExerc�cio: " + exercicio4 + "\nExerc�cio: " + exercicio5;
    }

}