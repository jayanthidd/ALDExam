package party;

import java.util.*;

public class InnerCircle {
    public List<Person> getFriends(Person person, int level) {
        ArrayList<Person> result = new ArrayList<>();
        HashMap<Person, Integer> distance = new HashMap<>();
        ArrayDeque<Person> queue = new ArrayDeque<>();

        // TODO: Initialisieren
        ArrayList<Person> list = new ArrayList<>();
        int i = 0;
        queue.add(person);
        distance.put(person, i);
        while (!queue.isEmpty()) {
            // TODO
            Person current = queue.remove();
            list = current.friends;
            i++;
            for (Person p : list){
                if (!distance.keySet().contains(p)){
                    queue.add(p);
                    distance.put(p, i);
                }
            }
        }
        for (Person p : distance.keySet()){
            if (distance.get(p)<=level){
                result.add(p);
            }
        }
        return result;
    }
}
