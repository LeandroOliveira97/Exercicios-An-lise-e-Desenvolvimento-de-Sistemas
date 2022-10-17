/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercícios.pkg5;

/**
 *
 * @author Leandro
 */
public class Aluno extends Pessoa {
    
    long matricula;
    String Curso;
    int semestreEntrada;

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public int getSemestreEntrada() {
        return semestreEntrada;
    }

    public void setSemestreEntrada(int semestreEntrada) {
        this.semestreEntrada = semestreEntrada;
    }
            
    
}
