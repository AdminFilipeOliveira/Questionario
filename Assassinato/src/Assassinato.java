import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class Assassinato{

    public static void main(String[] args) {
        List<String> perguntas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);   //Cria uma lista onde armazena as respostas
        System.out.println();

        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        int respostasPositivas = 0;

        for (String pergunta : perguntas) {      // Utilizando o for-each precorrendo as respostas "sim ou Não"
            System.out.println(pergunta + " (Sim/Não):");  
            String resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("sim")) {         // Só são contablizadas as respostas "sim"
                respostasPositivas++;
            }
        }

        if (respostasPositivas == 2) {
            System.out.println("Suspeita.");                           //Se "sim" 2 vezes "Suspeita"
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Cumplice.");                           //Se "sim" 3 a 4 vezes "Culplice"
        } else if (respostasPositivas == 5) {
            System.out.println("Culpada.");                            //Se "sim" 5 vezes "Culpada"
        } else {
            System.out.println("Inocente.");                           //Caso contrario "Inocente"
        }
    }
}




/* 
public class ExercicioProposto02 {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Perguntas: ");
        System.out.print("\nTelefonou para vítima? ");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Devia para vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count ++;
            }
        }

        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
    }
}
*/
