/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercícios.pkg5;


import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class Questao1 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        

        //Pessoa
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");
        String dataNascimento = JOptionPane.showInputDialog(null, "Digite a data de nascimento do aluno:(dd/MM/aaaa) ");
        //Formatar Data
        
        int rg = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o RG do aluno: "));

        //Aluno
        long matricula = Long.parseLong(JOptionPane.showInputDialog(null, "Digite a matricula do aluno: "));
        String curso = JOptionPane.showInputDialog(null, "Digite o curso do aluno:");
        int semestreEntrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o semestre de entrada do aluno: "));

        aluno.setNome(nome);
        aluno.setDataNascimento(dataNascimento);
        aluno.setRg(rg);
        aluno.setMatricula(matricula);
        aluno.setCurso(curso);
        aluno.setSemestreEntrada(semestreEntrada);

        System.out.println(" Aluno: " + aluno.getNome() + "\n Data Nascimento: " + aluno.getDataNascimento()
                + "\n RG: " + aluno.getRg() + "\n Matricula: " + aluno.getMatricula() + "\n Curso: " + aluno.getCurso()
                + "\n Semestre de entrada: " + aluno.getSemestreEntrada());
        JOptionPane.showMessageDialog(null, "Aluno: " + aluno.getNome() + "\n Data Nascimento: " + aluno.getDataNascimento()
                + "\n RG: " + aluno.getRg() + "\n Matricula: " + aluno.getMatricula() + "\n Curso: " + aluno.getCurso()
                + "\n Semestre de entrada: " + aluno.getSemestreEntrada());
    }
}
