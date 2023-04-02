import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> bikes = new LinkedList<String>();
        bikes.add("Ural");
        bikes.add("Honda");
        bikes.add("Kawasaki");
        bikes.add("Suzuki");
        bikes.add("Yamaha");
        //System.out.println(bikes);

        // Добавление первого элемента в список
        bikes.addFirst("Yamaha");
        System.out.println(bikes);

        // Добавление последнего элемента в список
        bikes.addLast("Suzuki");
        System.out.println(bikes);

        // Удаление первого элемента из списка
        bikes.removeFirst();
        System.out.println(bikes);

        // Удаление последнего элемента из списка
        bikes.removeLast();
        System.out.println(bikes);

        // Получение первого элемента списка
        System.out.println(bikes.getFirst());

        // Получение последнего элемента списока
        System.out.println(bikes.getLast());

        // Получение размера списка
        System.out.println("Размер списка: " + bikes.size());

        // Получение элемента с индексом 1
        System.out.println("Элемент с индексом 1: " + bikes.get(1));
    }
}