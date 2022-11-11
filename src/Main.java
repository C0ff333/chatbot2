import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi savu lietotājvārdu!");

        String userName = sc.nextLine();
        System.out.println("Sveiks! " + userName + " Esmu ChatBot");
        System.out.println("Būšu tavs virtuālais asistents par laikapstākļiem Rīgā");

        System.out.println("Padalies ar savu jautājumu!");
            String question = sc.nextLine();



                if (question.equals("Vai šodien līs?")) {
                    System.out.println("jā");
                } else if (question.equals("Vai šodien spīdēs saule?")) {
                    System.out.println("Nē, šodien līs lietus");
                } else if (question.equals("Vai šodien būs apmācies laiks?")) {
                    System.out.println("jā, ar nelieliem nokrišņiem");
                } else {
                    System.out.println("Man nav atbildes uz doto jautājumu!");
                }

        System.out.println("Vai tev ir kāds cits jautājums?");
                String answer = sc.nextLine();
                if (answer.equals("jā")) {
                    System.out.println("Uzdod savu jautājumu!");
                } else {
                    System.out.println("Paldies, ka izmantoji ChatBot!");
                }

                String question2 = sc.nextLine();

        if (question2.equals("Kāda būs temperatūra?")){
            System.out.println("Šodien temperatūras diapazons ir 10-13 celsija grādi");
        } else {
            System.out.println("Man nav atbildes uz doto jautājumu");
            System.out.println("Paldies, ka izmantoji ChatBot!");

        }




    }
}