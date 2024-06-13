
// — Создать класс Поток, содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterable;
// — Создать класс StreamComparator, реализующий сравнение количества групп, входящих в Поток;
// — Создать класс ПотокСервис, добавив в него метод сортировки списка потоков, используя созданный StreamComparator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Stream
 */
public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> groups;

    public Stream(){
        groups=new ArrayList<>();   
    }
    public void addGroup(StudyGroup group){
        groups.add(group);
    }
    public Iterator<StudyGroup> iterator(){
        return groups.iterator();
    }
    public int quantity() {
        
        throw new UnsupportedOperationException("Unimplemented method 'quantity'");
    }
}