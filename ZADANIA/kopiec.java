import java.util.PriorityQueue;
import java.util.Random;

class Task implements Comparable<Task> {
    String name;
    int priority;
    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return name + " (Priorytet: " + priority + ")";
    }
}

public class kopiec {
    public static void main(String[] args) throws InterruptedException {
        PriorityQueue<Task> queue = new PriorityQueue<>();
        Random random = new Random();
        String[] taskPool = {
                "Wysłać maila", "Naprawić serwer", "Zrobić backup",
                "Zaktualizować stronę", "Skanowanie sieci", "Restart bazy danych",
                "Przeprowadzić testy", "Zrobić raport", "Aktualizacja systemu"
        };

        int czasTrwania = 10; // sekund
        int czas = 0;

        System.out.println(" Symulacja działania kopca przez " + czasTrwania + " sekund...\n");

        while (czas < czasTrwania) {
            // Co 2 sekundy dodaj nowe zadanie
            if (czas % 1 == 0) {
                String name = taskPool[random.nextInt(taskPool.length)];
                int priority = 1 + random.nextInt(5); // priorytet 1–5
                Task newTask = new Task(name, priority);
                queue.add(newTask);
                System.out.println("[+" + czas + "s] Dodano zadanie: " + newTask);
            }

            // Co 3 sekundy wykonaj zadanie o najwyższym priorytecie
            if (czas % 2 == 0 && !queue.isEmpty()) {
                Task current = queue.poll();
                System.out.println("[*" + czas + "s] Wykonuję zadanie: " + current);
            }

            // Podgląd kolejki
            if (!queue.isEmpty()) {
                System.out.println("    Najbliższe zadanie: " + queue.peek());
            } else {
                System.out.println("    Kolejka jest pusta.");
            }

            Thread.sleep(1000); // 1 sekunda
            czas++;
        }

        System.out.println("\n️ Symulacja zakończona.");
    }
}
