package service;

import dominio.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabSchoolMain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Pessoa> listaPessoas = new ArrayList<>();
        CurriculoProfessor experienciaProf = new CurriculoProfessor();
        Pedagogo pedagogo = new Pedagogo();
        Aluno aluno = new Aluno();
        int id = 0;
        int opcao;
        int sair = 0;
        String condition;


        do {
            System.out.println("               ");
            System.out.println("                --Lab_School_System--                ");
            System.out.println("                                                   ");
            System.out.println("💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻");
            System.out.println("-------CADASTRO DE PESSOAS--------------");
            System.out.println("               ");
            System.out.println("Selecione uma das opções: ");
            System.out.println("               ");
            System.out.println("1 - Alunos , " +
                    "2 - Professores , " +
                    "3 - Funcionários  ");
            System.out.println("               ");
            System.out.println("💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻");
            System.out.println("-------LISTAR PESSOAS CADASTRADAS------");
            System.out.println("               ");
            System.out.println("Selecione uma das opções: ");
            System.out.println("               ");
            System.out.println("4 - Alunos\n" +
                    "5 - Professores\n" +
                    "6 - Funcionários\n" +
                    "7 - Todos\n");
            System.out.println("💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻");
            System.out.println("-------RELATORIO DOS ALUNOS------");
            System.out.println("               ");
            System.out.println("Selecione uma das opções: ");
            System.out.println("               ");
            System.out.println("8 -  Ativo\n" +
                    "9  - Irregular\n" +
                    "10 - Atendimento pedagógico\n" +
                    "11 - Inativo\n" +
                    "12 - Todos\n");
            System.out.println("💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻");
            System.out.println("-------RELATORIO DOS PROFESSORES------");
            System.out.println("               ");
            System.out.println("Selecione uma das opções: ");
            System.out.println("               ");
            System.out.println("13 - Front-End\n" +
                    "14 - Back-End\n" +
                    "15 - Full-Stack\n" +
                    "16 - Todos\n");
            System.out.println("💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻");
            System.out.println("-------ATENDIMENTO PEDAGOGICO------");
            System.out.println("               ");
            System.out.println("Selecione uma das opções: ");
            System.out.println("               ");
            System.out.println("17 - Cadastrar atendiemnto pedagógico");

            opcao = entrada.nextInt();

            if (opcao == 1 || opcao == 2 || opcao == 3) {
                id++;
            }

            switch (opcao) {

                case 1:
                    aluno = new Aluno();
                    System.out.println("NOME: ");
                    aluno.setNome(entrada.next());
                    System.out.println("CPF: ");
                    aluno.setCpf(entrada.next());
                    System.out.println("DATA DE NASCIMENTO: ");
                    aluno.setDataDeNascimento(entrada.next());
                    System.out.println("TELEFONE: ");
                    aluno.setTelefone(entrada.next());
                    System.out.println("ESTADO MATRICULA: ");
                    condition = (entrada.next());
                    if (condition == "Ativo" || condition == "Inativo" || condition == "Irregular" || condition == "Atendimento pedagógico") {
                        aluno.setCondicaoUM(condition);
                    }

                    System.out.println("NOTA DO PROCESSO SELETIVO: ");

                    aluno.setNota(entrada.nextDouble());
                    aluno.setIdentificadorCodigo(id);
                    listaPessoas.add(pedagogo);
                    listaPessoas.add(aluno);
                    do {
                        System.out.println(" 🔒 🔒 🔒 🔒🔒 🔒 🔒 🔒 🔒 🔒 ");
                        System.out.println("                                    ");
                        System.out.println("-- Pela Lei Geral de Proteção de Dados “LGPD” (Lei Federal nº 13.709.2018),\n " +
                                "na maior parte do tempo seremos o controlador das suas informações, sendo assim, \n" +
                                "responsável por definir o que acontece com estes dados e por protegê-los.");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();
                    } while (sair != 1);

                    break;

                case 2:
                    Professor professor = new Professor();
                    System.out.println("NOME: ");
                    professor.setNome(entrada.next());
                    System.out.println("CPF: ");
                    professor.setCpf(entrada.next());
                    System.out.println("DATA DE NASCIMENTO: ");
                    professor.setDataDeNascimento(entrada.next());
                    System.out.println("TELEFONE: ");
                    professor.setTelefone(entrada.next());
                    System.out.println("ESTADO MATRICULA: ");
                    professor.setEstado(entrada.next());
                    System.out.println("ESPECIALIZAÇAO: ");
                    professor.setExperienciaDesenvolvimento(entrada.next());
                    if (professor.getExperienciaDesenvolvimento().equals(experienciaProf.getExprUm()) ||
                            professor.getExperienciaDesenvolvimento().equals(experienciaProf.getExperDois()) ||
                            professor.getExperienciaDesenvolvimento().equals(experienciaProf.getExperTres())) {
                        professor.setExperienciaDesenvolvimento(experienciaProf.getExprUm());
                        System.out.println("                                    ");
                        System.out.println(" 🔒 🔒 🔒 🔒🔒 🔒 🔒 🔒 🔒 🔒 ");
                        System.out.println("                                    ");

                    } else {
                        System.out.println("Repita a operação, experiencia invalida! Exemploplo: frontEnd, backEnd, fullStack");
                    }
                    professor.setIdentificadorCodigo(id);
                    listaPessoas.add(professor);
                    listaPessoas.add(experienciaProf);
                    do {
                        System.out.println("                                    ");
                        System.out.println("-- Pela Lei Geral de Proteção de Dados “LGPD” (Lei Federal nº 13.709.2018),\n " +
                                "na maior parte do tempo seremos o controlador das suas informações, sendo assim, \n" +
                                "responsável por definir o que acontece com estes dados e por protegê-los.");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();
                    } while (sair != 1);

                    break;

                case 3:
                     pedagogo = new Pedagogo();
                    System.out.println("NOME: ");
                    pedagogo.setNome(entrada.next());
                    System.out.println("CPF: ");
                    pedagogo.setCpf(entrada.next());
                    System.out.println("DATA DE NASCIMENTO: ");
                    pedagogo.setDataDeNascimento(entrada.next());
                    System.out.println("TELEFONE: ");
                    pedagogo.setTelefone(entrada.next());
                    pedagogo.setIdentificadorCodigo(id);
                    listaPessoas.add(pedagogo);
                    do {
                        System.out.println(" 🔒 🔒 🔒 🔒🔒 🔒 🔒 🔒 🔒 🔒 ");
                        System.out.println("                                    ");
                        System.out.println("-- Pela Lei Geral de Proteção de Dados “LGPD” (Lei Federal nº 13.709.2018),\n " +
                                "na maior parte do tempo seremos o controlador das suas informações, sendo assim, \n" +
                                "responsável por definir o que acontece com estes dados e por protegê-los.");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();
                    } while (sair != 1);
                    break;


                case 4:
                    for (Pessoa pessoa : listaPessoas) {
                        if (pessoa instanceof Aluno) {
                            System.out.println("ALUNO(A) ➡ " + "CODIGO: " + pessoa.getIdentificadorCodigo() + ", NOME: "
                                    + pessoa.getNome() + ", CPF: " + pessoa.getCpf());
                        }
                    }
                    do {
                        System.out.println("     ");
                        System.out.println("--Operação finalizada!");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();

                    } while (sair != 1);

                    break;

                case 5:
                    for (Pessoa pessoa : listaPessoas) {
                        if (pessoa instanceof Professor) {
                            System.out.println("PROFESSOR(A) ➡ " + "CODIGO: " + pessoa.getIdentificadorCodigo() + ", NOME: "
                                    + pessoa.getNome() + ", CPF: " + pessoa.getCpf());
                        }
                    }
                    do {
                        System.out.println("     ");
                        System.out.println("--Operação finalizada!");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();

                    } while (sair != 1);

                    break;

                case 6:
                    for (Pessoa pessoa : listaPessoas) {
                        if (pessoa instanceof Pedagogo) {
                            System.out.println("PEDAGOGO(A) ➡ " + "CODIGO: " + pessoa.getIdentificadorCodigo() + ", NOME: "
                                    + pessoa.getNome() + ", CPF: " + pessoa.getCpf());
                        }
                    }
                    do {
                        System.out.println("     ");
                        System.out.println("--Operação finalizada!");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();

                    } while (sair != 1);

                    break;
                case 7:
                    for (Pessoa pessoa : listaPessoas) {
                        if (pessoa instanceof Professor) {
                            System.out.println("PROFESSOR(A) ➡ " + "CODIGO: " + pessoa.getIdentificadorCodigo() + ", NOME: "
                                    + pessoa.getNome() + ", CPF: " + pessoa.getCpf());
                        }
                        if (pessoa instanceof Pedagogo) {
                            System.out.println("PEDAGOGO(A) ➡ " + "CODIGO: " + pessoa.getIdentificadorCodigo() + ", NOME: "
                                    + pessoa.getNome() + ", CPF: " + pessoa.getCpf());
                        }
                        if (pessoa instanceof Aluno) {
                            System.out.println("ALUNO(A) ➡ " + "CODIGO: " + pessoa.getIdentificadorCodigo() + ", NOME: "
                                    + pessoa.getNome() + ", CPF: " + pessoa.getCpf());
                        }

                    }
                    do {
                        System.out.println("     ");
                        System.out.println("--Operação finalizada!");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();

                    } while (sair != 1);

                    break;
                case 8:
                    for (Pessoa pessoa : listaPessoas) {

                        if (pessoa instanceof Aluno) {
                            System.out.println(((Aluno) pessoa).getCondicaoUM()+" ID: "
                                    +pessoa.getIdentificadorCodigo()+" NOME: "+pessoa.getNome());
                        }
                    }
                    do {
                        System.out.println("     ");
                        System.out.println("--Operação finalizada!");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();

                    } while (sair != 1);

                    break;


                case 9:
                    for (Pessoa pessoa : listaPessoas) {

                        if (pessoa instanceof Aluno) {
                            System.out.println(((Aluno) pessoa).getCondicaoUM()+" ID: "
                                    +pessoa.getIdentificadorCodigo()+" NOME: "+pessoa.getNome()+"");
                        }
                    }
                    do {
                        System.out.println("     ");
                        System.out.println("--Operação finalizada!");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();

                    } while (sair != 1);

                    break;

                case 10:
                    for (Pessoa pessoa : listaPessoas) {

                        if (pessoa instanceof Aluno) {
                            System.out.println(((Aluno) pessoa).getCondicaoUM()+" ID: "
                                    +pessoa.getIdentificadorCodigo()+" NOME: "+pessoa.getNome()+" ");
                        }
                    }
                    do {
                        System.out.println("     ");
                        System.out.println("--Operação finalizada!");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();

                    } while (sair != 1);

                    break;

                case 11:
                    for (Pessoa pessoa : listaPessoas) {

                        if (pessoa instanceof Aluno) {
                            System.out.println(((Aluno) pessoa).getCondicaoUM()+" ID: "
                                    +pessoa.getIdentificadorCodigo()+" NOME: "+pessoa.getNome()+"  ");
                        }
                    }
                    do {
                        System.out.println("     ");
                        System.out.println("--Operação finalizada!");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();

                    } while (sair != 1);

                    break;

                case 12:
                    for (Pessoa pessoa : listaPessoas) {

                        if (pessoa instanceof Aluno) {
                            System.out.println(((Aluno) pessoa).getCondicaoUM()+" ID: "
                                    +pessoa.getIdentificadorCodigo()+" NOME: "+pessoa.getNome()+"   ");
                        }
                    }
                    do {
                        System.out.println("     ");
                        System.out.println("--Operação finalizada!");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();

                    } while (sair != 1);

                    break;

                case 13:
                    for (Pessoa pessoa : listaPessoas) {
                        if (pessoa instanceof Professor) {
                            System.out.println("Professor: " + pessoa.getIdentificadorCodigo() + " " + pessoa.getNome()+"");
                        }
                        if (pessoa instanceof CurriculoProfessor) {
                            System.out.println("Experiencia: " + experienciaProf.getExprUm());

                        }

                    }
                    do {
                        System.out.println("     ");
                        System.out.println("--Operação finalizada!");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();

                    } while (sair != 1);

                    break;
                case 14:
                    for (Pessoa pessoa : listaPessoas) {
                        if (pessoa instanceof Professor) {
                            System.out.println("Professor: " + pessoa.getIdentificadorCodigo() + "-" + pessoa.getNome());
                        }
                        if (pessoa instanceof CurriculoProfessor) {
                            System.out.println("Experiencia: " + experienciaProf.getExperDois());

                        }

                    }
                    do {
                        System.out.println("     ");
                        System.out.println("--Operação finalizada!");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();

                    } while (sair != 1);

                    break;
                case 15:
                    for (Pessoa pessoa : listaPessoas) {
                        if (pessoa instanceof Professor) {
                            System.out.println("Professor: " + pessoa.getIdentificadorCodigo() + "-" + pessoa.getNome());
                        }
                        if (pessoa instanceof CurriculoProfessor) {
                            System.out.println("Experiencia: " + experienciaProf.getExperTres());

                        }

                    }
                    do {
                        System.out.println("     ");
                        System.out.println("--Operação finalizada!");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();

                    } while (sair != 1);

                    break;
                case 16:
                    for (Pessoa pessoa : listaPessoas) {
                        if (pessoa instanceof Professor) {
                            System.out.println("Professores: " + pessoa.getIdentificadorCodigo() + " " + pessoa.getNome()+" "
                                    +((Professor) pessoa).getExperienciaDesenvolvimento());
                        }
                    }
                    do {
                        System.out.println("     ");
                        System.out.println("--Operação finalizada!");
                        System.out.println("                      ");
                        System.out.println("--Digite 1 para retornar ao menu pricipal.");
                        sair = entrada.nextInt();

                    } while (sair != 1);

                    break;
                case 17:
                    for (Pessoa pessoa : listaPessoas) {
                        if (pessoa instanceof Pedagogo) {
                            System.out.println("Pedagogo com mais atedimentos: "+((Pedagogo) pessoa).contagemAtedimento+" "+ pessoa.getNome());

                        }
                    }
            }

        }while (opcao != 0) ;

    }
}


