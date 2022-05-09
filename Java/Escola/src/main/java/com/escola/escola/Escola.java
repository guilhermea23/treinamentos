package com.escola.escola;
public class Escola {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p1.setSexo("M");
        p2.setNome("Claudia");
        p2.setSexo("F");
        p3.setNome("Maria");
        p3.setSexo("F");
        p3.setIdade(26);
        p4.setNome("José");
        p4.setSexo("M");
        
        System.out.println(p1.toString());
        System.out.println("");
        System.out.println(p2.toString());
        System.out.println("");
        System.out.println(p3.toString());
        System.out.println("");
        System.out.println(p4.toString());
    }
}
