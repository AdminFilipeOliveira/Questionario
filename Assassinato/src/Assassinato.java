import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
