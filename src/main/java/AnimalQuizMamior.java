import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalQuizMamior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preguntas y respuestas correctas con opciones
        String[][] questionsAndAnswers = {
            {"Como hace la vaca?", "Muuuuu", "Baa", "Oink", "Miau"},
            {"Como hace la Calila?", "Miau", "Muuuuu", "Guau", "Cuac"},
            {"Como hace la ballena?", "Nose, solo se que comen churus de ballena", "Click", "Silbido", "Rugido"},
            {"Como se llama la gata mas amarilla?", "Emma", "Luna", "Mila", "Nala"},
            {"Como hace la Mabel?", "Biribirombombirom", "Miau", "Woof", "Oink"},
            {"Quien es la bolola mas hermosa del mundo?", "Maria <3", " ", " ", " "}
                
        };

        int correctAnswers = 0;

        // Iteramos sobre las preguntas
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            String[] qa = questionsAndAnswers[i];

            // Mezclamos las opciones de respuesta
            List<String> options = new ArrayList<>();
            for (int j = 1; j < 5; j++) {
                options.add(qa[j]);
            }
            Collections.shuffle(options);

            // Mostrar la pregunta y las opciones
            System.out.println(qa[0]);
            System.out.println("a) " + options.get(0));
            System.out.println("b) " + options.get(1));
            System.out.println("c) " + options.get(2));
            System.out.println("d) " + options.get(3));

            String userAnswer = scanner.nextLine().trim().toLowerCase();

            // Convertimos la letra de la opcion a la respuesta correspondiente
            String selectedAnswer = "";
            switch (userAnswer) {
                case "a":
                    selectedAnswer = options.get(0);
                    break;
                case "b":
                    selectedAnswer = options.get(1);
                    break;
                case "c":
                    selectedAnswer = options.get(2);
                    break;
                case "d":
                    selectedAnswer = options.get(3);
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    continue;
            }

            // Se verifica si la respuesta seleccionada es igual a la correcta
            if (selectedAnswer.equals(qa[1])) {
                correctAnswers++;
            }
        }

        // Verificamos si todas las respuestas fueron correctas
        if (correctAnswers == questionsAndAnswers.length) {
            System.out.println("GANASTELEEE! Respondiste todas las preguntas correctamente.");
            System.out.println("Aqui tienes tu premio uwu: https://www.youtube.com/watch?v=rl1volqniBg");
        } else {
            System.out.println("pero lokillaaaaaa");
        }

        scanner.close();
    }
}