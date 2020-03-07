import java.util.*;

import static java.lang.System.out;


public class Main {
    public static void main(String[] args) {
        String [] FIO = {"Иванов", "Петров", "Сидоров", "Соколов","Иванов", "Петров", "Сидоров", "Соколов", "Данилов", "Данилов"};

        Map<String, Integer> map = new HashMap<>();
        for (String fio : FIO) {
            Integer val;
            val = map.get(fio);
            if (val == null){
                map.put(fio, 1);
            } else {
                map.put(fio, val + 1);
            }
        }
        Phonebook pb = new Phonebook();

        pb.add("Иванов", "123");
        pb.add("Петров", "456");
        pb.add("Петров", "789");
        pb.add("Иванов", "25123");


        out.println(map);
        out.println(pb.get("Иванов"));
    }



}
