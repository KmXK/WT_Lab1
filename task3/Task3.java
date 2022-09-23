package task3;

import task3.repositories.DoublesRepository;
import task3.services.TableDrawer;

public class Task3 {
    public static void main(String[] args) {
        var doublesRepository = new DoublesRepository();
        var x = doublesRepository.getNext();
        var y = doublesRepository.getNext();
        var h = doublesRepository.getNext();

        if(x > y) {
            System.out.println("Error: x cannot be more than y.");
            return;
        }

        var tableDrawer = new TableDrawer(2);

        tableDrawer.addRow(new String[] {"x", "F = tg(x)"});

        while(x <= y) {
            tableDrawer.addRow(new String[] {
                    Double.toString(x),
                    Double.toString(Math.tan(x))
            });

            x += h;
        }

        System.out.println(tableDrawer);
    }
}
