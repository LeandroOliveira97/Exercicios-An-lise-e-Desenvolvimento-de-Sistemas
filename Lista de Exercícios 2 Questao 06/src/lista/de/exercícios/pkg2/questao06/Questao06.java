/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.de.exercícios.pkg2.questao06;

import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class Questao06 {

    public static void main(String[] args) {

        Alunos Aluno = new Alunos();

        Aluno.nome = JOptionPane.showInputDialog("Digite o nome do aluno");
        Aluno.matricula = JOptionPane.showInputDialog("Digite a matricula do aluno");

        System.out.println("O aluno  " + Aluno.nome + " esta associado a matricula  " + Aluno.matricula);
        JOptionPane.showMessageDialog(null, "O aluno  " + Aluno.nome + " esta associado a matricula  " + Aluno.matricula);
    }

}
