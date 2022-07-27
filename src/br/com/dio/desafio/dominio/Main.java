package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRaquel = new Dev();
        devRaquel.setNome("Raquel");
        devRaquel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Raquel: " + devRaquel.getConteudosInscritos());
        devRaquel.progredir();
        devRaquel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Raquel: " + devRaquel.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Raquel: " + devRaquel.getConteudosConcluidos());
        System.out.println("XP: " + devRaquel.calcularXp());

        System.out.println("---------------------");

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Luiz: " + devLuiz.getConteudosInscritos());
        devLuiz.progredir();
        devLuiz.progredir();
        devLuiz.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Luiz: " + devLuiz.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Luiz: " + devLuiz.getConteudosConcluidos());
        System.out.println("XP: " + devLuiz.calcularXp());






    }

}
